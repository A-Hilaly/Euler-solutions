
open Big_int

let rec range i j = if i > j then [] else i :: (range (i+1) j)

let is_prime n =
  let is_divisor d p =
    if p mod d = 0 then 1 else 0
  in
  let targets = range 2 (int_of_float(sqrt(float_of_int(n))))
  in
  let rec test_targets k targets =
    match targets with
      | [] -> 1
      | x::trg -> if is_divisor x k = 1 then 0 else test_targets k trg
  in
  test_targets n targets

let prime_factor d n =
  if n mod d = 0 && is_prime d = 1 then true else false

let rec lpd p targets maxd = match targets with
  | [] -> maxd
  | d::trg -> if prime_factor d p then lpd p trg d else lpd p trg maxd

let rec solve n =
  let cibles = range 2 (int_of_float(sqrt(float_of_int(n)))-1)
  in
  lpd n cibles 2

let __kappa__ =
  is_prime 3000;;



print_int (__kappa__);;
print_newline ()
