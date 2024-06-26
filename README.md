# software-modeling-practice
นายเลิศพิพัฒน์ กาญจนเรืองโรจน์ 6510450917

1. มีการเพิ่ม parameter ใน class Square เนื่องจากเป็นการลด complexity (ใน taketurn มีการ update ค่า Square ให้ piece ซึ่ง Player จำเป็นต้องส่ง loc และ fvTot ให้ Board คืนค่าจาก method getSquare(oldLoc, fvTot) ถ้าส่งด้วยชื่ออย่างเดียวจำเป็นจะต้องเขียน for loop ซึ่งสร้าง complexity เป็น O(n) แต่ถ้าเรากำหนด index ให้ Square จะทำให้ไม่จำเป็นต้องหา index ของ loc เก่าใน list จาก Board นั่นหมายถึง O(1) และทำให้ class Square make sense ขึ้นเพราะถ้าทั้ง class Square เก็บแค่ชื่อ เราเก็บแค่ String[] ใน Board ก็ได้)





2. มีการเพิ่ม method บางอย่างเช่น getter หรือ ใช้ init parameter ใน class