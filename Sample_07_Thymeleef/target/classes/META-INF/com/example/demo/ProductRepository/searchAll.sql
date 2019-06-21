select * from Product where
/*%if goodsId != null */
 ProductID like /* @infix(goodsId) */'00001'
/*%end*/
/*%if goodsName != null */
 and
 ProductName like /* @infix(goodsName) */'hoge'
/*%end*/
/*%if priceFrom != null && priceTo != null */
 and
 Price between /* priceFrom */10 and /* priceTo */10000
/*%end*/
;