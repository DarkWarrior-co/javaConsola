select *
from dbo.EmpresasTransporte
insert into dbo.EmpresasTransporte(idEmpresasTransporte,NombreEmpresa,Telefono)
values((select max(idEmpresasTransporte )from dbo.EmpresasTransporte)+1,'baboo',5454545)
update  dbo.EmpresasTransporte
set idEmpresasTransporte=6
where idEmpresasTransporte=16

update  dbo.EmpresasTransporte
set NombreEmpresa='doggle'
where idEmpresasTransporte=6

update  dbo.EmpresasTransporte
set telefono=56434589
where idEmpresasTransporte=6

Delete from dbo.EmpresasTransporte
where idEmpresasTransporte between 6 and 15

select *
from dbo.Categoria
go
insert into dbo.Categoria(idCategoria,Nombrecategoria,Descripcion)
values ((select max(idCategoria)from dbo.Categoria)+1,'tragos','licores nacionales y estrangeros') 

select * from dbo.Producto

insert into dbo.Producto(idProducto,NombreProducto,idProveedor,idCategoria,CantidadPorUnidad,PrecioUnidad,UnidadesEnExistencia,UnidadesEnPedido,NivelNuevoPedido,Suspendido)
values(((select max(idProducto)from dbo.Producto)+1),'Vino',1,11,100,10000,100,99,5,0)

insert into dbo.Producto(idProducto,NombreProducto,idProveedor,idCategoria,CantidadPorUnidad,PrecioUnidad,UnidadesEnExistencia,UnidadesEnPedido,NivelNuevoPedido,Suspendido)
values(((select max(idProducto)from dbo.Producto)+1),'Tequila',1,11,100 ,10000,100,99,5,0)

insert into dbo.Producto(idProducto,NombreProducto,idProveedor,idCategoria,CantidadPorUnidad,PrecioUnidad,UnidadesEnExistencia,UnidadesEnPedido,NivelNuevoPedido,Suspendido)
values(((select max(idProducto)from dbo.Producto)+1),'chicha',1,11,100,10000,100,99,5,0)


select * from dbo.Proveedor
select * from pedido
select * from Empleado
select* from cliente
select *from EmpresasTransporte
insert into dbo.Pedido(idPedido,idCliente,idEmpleado,FechaPedido,FechaEntrega,FechaEnvio,IdEmpresasTransporte,Flete,Destinatario,DireccionDestinatario,CiudadDestinatario,RegionDestinatario,CodPostalDestinatario,Paisdestinatario)
values(((select max(IdPedido)from Pedido)+1),12,9,'2015-11-06','2015-11-01','2015-11-02',3,2.38,'Hanari cames','keskuskatu 45','Helsinki','s','21240','Finlandia')