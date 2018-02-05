(* OCAML PRIME GEN *)

open List

(* RANGE *)
let rec range i j = if i > j then [] else i :: (range (i+1) j)


(* ASSERT RANGE *)
let rec assert_range m n=
    match (m, n) with
      | (_, 0) -> raise InvalidRange
      | (a, b) -> if a > b then raise InvalidRange


(* IS PRIME *)
let is_prime n =
  let is_divisor d p =
    if p mod d = 0 then 1 else 0
  in
  let targets = range 2 (int_of_float(sqrt(float_of_int(n))))
  in
  let rec test_targets k targets =
    match targets with
      | [] -> true
      | x::trg -> if is_divisor x k = 1 then false else test_targets k trg
  in
  test_targets n targets
;;



let rec print_list d =
  match d with
   | [] -> ()
   | e::l -> print_int e ; print_string " " ; print_list l

let get_primes m n =
  let arg = range m n in
  List.filter is_prime arg
;;

let l = 1::[];;

let d = get_primes 2 120000 in
(*print_list d;*)
print_int(List.nth d 10001)
