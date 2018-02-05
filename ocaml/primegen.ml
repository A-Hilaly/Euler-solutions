(* OCAML PRIME GEN *)


(* When range is invalid *)
exception InvalidRange

(* When expected argument is not number *)
exception InvalidNumber

(* When prompted command is unknown*)
exception UnkownCommand

(* When command is correct but args are wierd *)
exception IllegalExpression


(* RANGE *)
let rec range i j = if i > j then [] else i :: (range (i+1) j)


(* IS PRIME *)
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


(* GET PRIMES *)
let rec get_primes m n=
    match (m, n) with
      | (_, 0) -> raise InvalidRange
      | (a, b) -> if a > b then raise InvalidRange


let __kappa__ =
    is_prime 19;;

print_int(__kappa__);;

print_int(8);;

get_primes 1 0;;
