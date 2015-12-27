# ws-gip
EPIAS Intra Day Market Axis2 Web Service Client

## Example Usage

```
GuniciWSStub stub = GuniciWSStubFactory.newInstance("username", "password");

TeklifAlOrgSaatlikDocument tal = TeklifAlOrgSaatlikDocument.Factory.newInstance();
tal.addNewTeklifAlOrgSaatlik();

stub.teklifAlOrgSaatlik(tal);
stub.cleanup();
```    
