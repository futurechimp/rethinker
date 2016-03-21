Rethinker
=========

An extremely simpl(istic) way to convert RethinkDb's Java HashMaps to
Scala collections. It doesn't bother with insert syntax, or querying, 
both of which work fine for me with the new RethinkDb Java driver. 

What it does do is take the relatively untyped rows coming out
of RethinkDb, bang them around a bit with `json4s`, and return them 
as case class instances. 

At the moment, I'm not worried about being Reactive, dealing with
the Iterators properly, or anything much at all beyone the next 15 minutes
with my (presently very small) data set.

Current status
--------------

I was born two months premature and I still could have won an arm wrestle
 against this code. It's weak and simplistic. Don't use it. 