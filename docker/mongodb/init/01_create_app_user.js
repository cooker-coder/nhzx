db = db.getSiblingDB('nhzx');
db.createUser({
  user: 'nhzx',
  pwd: '123321',
  roles: [{ role: 'readWrite', db: 'nhzx' }]
});
