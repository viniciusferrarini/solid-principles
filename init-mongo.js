db = db.getSiblingDB('solid-hotel');

db.createUser({
  user: "root",
  pwd: "root",
  roles: [{ role: "readWrite", db: "solid-hotel" }]
});