#include <stdio.h>
#include <json-c/json.h>

// sudo apt install libjson-c-dev install the json-c library
/*
CHALLENGE:  It returns an array containing all the properties in the object 
it receives as an argument.
let users = {
  Alan: {
    age: 27,
    online: false
  },
  Jeff: {
    age: 32,
    online: true
  },
  Sarah: {
    age: 48,
    online: false
  },
  Ryan: {
    age: 19,
    online: true
  }
};
*/

void getKeys(struct json_object *obj)
{
    struct json_object_iterator it;
    struct json_object_iterator itEnd;
    it = json_object_iter_begin(obj);
    itEnd = json_object_iter_end(obj);
    while (!json_object_iter_equal(&it, &itEnd))
    {
        printf("%s\n", json_object_iter_peek_name(&it));
        json_object_iter_next(&it);
    }
}

void main()
{
    json_object *users = json_tokener_parse("{'Alan': {'age': 27, 'online': false },'Jeff': {'age': 32,'online': true},'Sarah': {'age': 48,'online': false},'Ryan': {'age': 19,'online': true}}");
    json_object *OneUser;
    json_object_object_get_ex(users, "Alan", &OneUser);
    getKeys(users);
    getKeys(OneUser);
}