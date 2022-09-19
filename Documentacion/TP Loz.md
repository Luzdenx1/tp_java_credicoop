# Modelos
````ts
class Publication{
  store: Store;
  is_active: boolean; /** Analizar si conviene meterlo como un Enum */
  product: api.models.Product;
}

class api.models.Product {
  name: String;
  price: number;
  description: String;
  fabricationTime: TimeRanges;

  personalizations: Personalization[];
  children: api.models.Product[];
  
}

class Personalization{
  area: String;
  type: String;

  name: string;
  aditionalPrice: number;
}

class Seller {
  
  availablePaymentMethods: PaymentMethod[]

  customizeProduct(product:api.models.Product, personalization[]:Personalization){}
  addPaymentMethod(){}
  emmitInvoice(){}


}

class PaymentMethod{

}

class Store{
  seller: Seller;
}

class Item{
  product: api.models.Product;
  quantity: Number;
}


class Cart {
  items: Items[];
  client: Client;
}

class Client {
  username: String;
  firstName: String;
  lastName: String;
  DNI: String
}

````

------ 

# Operaciones
- [ ] Crear un producto
- [ ] Personalizar un producto
- [ ] Crear una publicacion de un producto
	- [ ] Pausar
	- [ ] Cancelar publicacion
- [ ] Agregar un producto al carrito
- [ ] Comprar un producto
- [ ] Comprar un carrito
- [ ] Pensar operacion de pago