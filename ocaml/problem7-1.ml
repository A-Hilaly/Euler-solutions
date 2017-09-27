
let primes = 7::5::3::2::[]

let rec print_list = function
  | [] -> ()
  | e::l -> print_int e ; print_string " " ; print_list l

let is_divisor d p =
  if p mod d = 0 then true else false

let rec validate_candidat plist cand =
  let revplist = List.rev plist in
  match revplist with
    | [] -> true
    | d::ls -> if d > int_of_float(sqrt(float_of_int(cand))) then
                  true
                else if is_divisor d cand then
                  false
                else
                  validate_candidat (List.rev ls) cand

let rec find_next plist candidatu =
  if validate_candidat plist candidatu then
    candidatu
  else
    find_next plist (candidatu + 2)

let rec generate_primes_with_limit nmax primes =
  print_int (List.hd primes);
  print_newline ();
  if List.hd primes > nmax then
    primes
  else
    let nxt_primes = find_next primes (List.hd primes + 2) in
    generate_primes_with_limit nmax (nxt_primes::primes)

let rec generate_primes_indexed primes nthprime idx =
  print_int (idx);
  print_newline ();
  if idx > nthprime then List.hd primes
  else
    let nxt_primes = find_next primes (List.hd primes + 2) in
    generate_primes_indexed (nxt_primes::primes) nthprime (idx + 1)


let rec sum_list ls s = match ls with
  | [] -> s
  | x::[] -> s
  | x::lss -> sum_list lss (s + x)

let __kappa__ =
  generate_primes_indexed primes 10001 4;;

print_int (__kappa__);;
