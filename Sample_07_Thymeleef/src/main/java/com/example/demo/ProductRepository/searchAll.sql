select * from Product where
/*%if ProductID != null */
 ProductID like /* @infix(ProductID) */'00001'
/*%end*/
/*%if ProductName != null */
 and
 ProductName like /* @infix(ProductName) */'hoge'
/*%end*/
/*%if PriceFrom != null && PriceTo != null */
 and
 Price between /* PriceFrom */10 and /* PriceTo */10000
/*%end*/
;