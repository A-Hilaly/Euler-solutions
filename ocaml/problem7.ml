let rec print_list = function
  | [] -> ()
  | e::l -> print_int e ; print_string " " ; print_list l

let is_divisor d p =
  if p mod d = 0 then true else false

let next_prime primes len =
  let rec check_divisors lis p =
  match List.rev lis with
    | [] -> true
    | d::ls -> if d > int_of_float(sqrt(float_of_int(p))) then
                  true
                else if is_divisor d p then
                  false
                else
                  check_divisors (List.tl lis) p
  in
  let rec find_next num use =
    print_int(1111111111111111);
    print_newline();
    print_int(num);
    print_newline();
    if check_divisors use num then
      num
    else find_next (num + 2) use
  in
  let next = find_next (List.hd primes + 2) primes in
  let b = next::primes in
  print_int(List.hd b);
  b


let rec solve primes nth =
  let len = List.length primes in
  if len > nth then
    primes
  else
    solve (next_prime primes len) nth

let primes = 3::2::[]

let __kappa__ =
  solve primes 10001;;

print_list (__kappa__);;
print_newline ();;
