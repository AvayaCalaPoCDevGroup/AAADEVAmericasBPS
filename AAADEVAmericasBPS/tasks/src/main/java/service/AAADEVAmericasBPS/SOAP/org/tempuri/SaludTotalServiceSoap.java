
package service.AAADEVAmericasBPS.SOAP.org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SaludTotalServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SaludTotalServiceSoap {


    /**
     * 
     * @param tipoDocumento
     * @param idLlamada
     * @param numeroDocumento
     * @param idCampanaTitan
     * @return
     *     returns org.tempuri.InformacionAfiliadoModelIVR
     */
    @WebMethod(operationName = "ConsultaAfiliado", action = "http://tempuri.org/ConsultaAfiliado")
    @WebResult(name = "ConsultaAfiliadoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaAfiliado", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaAfiliado")
    @ResponseWrapper(localName = "ConsultaAfiliadoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaAfiliadoResponse")
    public InformacionAfiliadoModelIVR consultaAfiliado(
        @WebParam(name = "tipoDocumento", targetNamespace = "http://tempuri.org/")
        int tipoDocumento,
        @WebParam(name = "numeroDocumento", targetNamespace = "http://tempuri.org/")
        String numeroDocumento,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada,
        @WebParam(name = "idCampanaTitan", targetNamespace = "http://tempuri.org/")
        int idCampanaTitan);

    /**
     * 
     * @param tipoDocumento
     * @param idLlamada
     * @param numeroDocumento
     * @param idCampanaTitan
     * @return
     *     returns org.tempuri.ArrayOfString
     */
    @WebMethod(operationName = "ConsultaAfiliadoLista", action = "http://tempuri.org/ConsultaAfiliadoLista")
    @WebResult(name = "ConsultaAfiliadoListaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaAfiliadoLista", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaAfiliadoLista")
    @ResponseWrapper(localName = "ConsultaAfiliadoListaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaAfiliadoListaResponse")
    public ArrayOfString consultaAfiliadoLista(
        @WebParam(name = "tipoDocumento", targetNamespace = "http://tempuri.org/")
        int tipoDocumento,
        @WebParam(name = "numeroDocumento", targetNamespace = "http://tempuri.org/")
        String numeroDocumento,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada,
        @WebParam(name = "idCampanaTitan", targetNamespace = "http://tempuri.org/")
        int idCampanaTitan);

    /**
     * 
     * @param idLlamada
     * @param idAfiliado
     * @return
     *     returns org.tempuri.CitasAsignadasGeneralModelIVR
     */
    @WebMethod(operationName = "ConsultaCitasAsignadasGeneral", action = "http://tempuri.org/ConsultaCitasAsignadasGeneral")
    @WebResult(name = "ConsultaCitasAsignadasGeneralResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCitasAsignadasGeneral", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasAsignadasGeneral")
    @ResponseWrapper(localName = "ConsultaCitasAsignadasGeneralResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasAsignadasGeneralResponse")
    public CitasAsignadasGeneralModelIVR consultaCitasAsignadasGeneral(
        @WebParam(name = "idAfiliado", targetNamespace = "http://tempuri.org/")
        String idAfiliado,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idLlamada
     * @param idAfiliado
     * @return
     *     returns org.tempuri.ArrayOfString
     */
    @WebMethod(operationName = "ConsultaCitasAsignadasGeneralLista", action = "http://tempuri.org/ConsultaCitasAsignadasGeneralLista")
    @WebResult(name = "ConsultaCitasAsignadasGeneralListaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCitasAsignadasGeneralLista", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasAsignadasGeneralLista")
    @ResponseWrapper(localName = "ConsultaCitasAsignadasGeneralListaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasAsignadasGeneralListaResponse")
    public ArrayOfString consultaCitasAsignadasGeneralLista(
        @WebParam(name = "idAfiliado", targetNamespace = "http://tempuri.org/")
        String idAfiliado,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idLlamada
     * @param idAfiliado
     * @param idEspecialidad
     * @return
     *     returns org.tempuri.CitasAsignadasEspecialidadModelIVR
     */
    @WebMethod(operationName = "ConsultaCitasAsignadasEspecialidad", action = "http://tempuri.org/ConsultaCitasAsignadasEspecialidad")
    @WebResult(name = "ConsultaCitasAsignadasEspecialidadResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCitasAsignadasEspecialidad", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasAsignadasEspecialidad")
    @ResponseWrapper(localName = "ConsultaCitasAsignadasEspecialidadResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasAsignadasEspecialidadResponse")
    public CitasAsignadasEspecialidadModelIVR consultaCitasAsignadasEspecialidad(
        @WebParam(name = "idAfiliado", targetNamespace = "http://tempuri.org/")
        String idAfiliado,
        @WebParam(name = "idEspecialidad", targetNamespace = "http://tempuri.org/")
        int idEspecialidad,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idLlamada
     * @param idAfiliado
     * @param idEspecialidad
     * @return
     *     returns org.tempuri.ArrayOfString
     */
    @WebMethod(operationName = "ConsultaCitasAsignadasEspecialidadLista", action = "http://tempuri.org/ConsultaCitasAsignadasEspecialidadLista")
    @WebResult(name = "ConsultaCitasAsignadasEspecialidadListaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCitasAsignadasEspecialidadLista", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasAsignadasEspecialidadLista")
    @ResponseWrapper(localName = "ConsultaCitasAsignadasEspecialidadListaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasAsignadasEspecialidadListaResponse")
    public ArrayOfString consultaCitasAsignadasEspecialidadLista(
        @WebParam(name = "idAfiliado", targetNamespace = "http://tempuri.org/")
        String idAfiliado,
        @WebParam(name = "idEspecialidad", targetNamespace = "http://tempuri.org/")
        int idEspecialidad,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idPaciente
     * @param idLlamada
     * @param planSalud
     * @param ciudadResidencia
     * @param tipoConsulta
     * @param codigoIPS
     * @param nombreUsuario
     * @param idEspecialidad
     * @return
     *     returns org.tempuri.CitasDisponiblesModelIVR
     */
    @WebMethod(operationName = "ConsultaCitasDisponibles", action = "http://tempuri.org/ConsultaCitasDisponibles")
    @WebResult(name = "ConsultaCitasDisponiblesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCitasDisponibles", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasDisponibles")
    @ResponseWrapper(localName = "ConsultaCitasDisponiblesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasDisponiblesResponse")
    public CitasDisponiblesModelIVR consultaCitasDisponibles(
        @WebParam(name = "idPaciente", targetNamespace = "http://tempuri.org/")
        String idPaciente,
        @WebParam(name = "idEspecialidad", targetNamespace = "http://tempuri.org/")
        String idEspecialidad,
        @WebParam(name = "planSalud", targetNamespace = "http://tempuri.org/")
        String planSalud,
        @WebParam(name = "nombreUsuario", targetNamespace = "http://tempuri.org/")
        String nombreUsuario,
        @WebParam(name = "ciudadResidencia", targetNamespace = "http://tempuri.org/")
        String ciudadResidencia,
        @WebParam(name = "codigoIPS", targetNamespace = "http://tempuri.org/")
        String codigoIPS,
        @WebParam(name = "tipoConsulta", targetNamespace = "http://tempuri.org/")
        int tipoConsulta,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idPaciente
     * @param idLlamada
     * @param planSalud
     * @param ciudadResidencia
     * @param tipoConsulta
     * @param codigoIPS
     * @param nombreUsuario
     * @param idEspecialidad
     * @return
     *     returns org.tempuri.ArrayOfString
     */
    @WebMethod(operationName = "ConsultaCitasDisponiblesLista", action = "http://tempuri.org/ConsultaCitasDisponiblesLista")
    @WebResult(name = "ConsultaCitasDisponiblesListaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCitasDisponiblesLista", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasDisponiblesLista")
    @ResponseWrapper(localName = "ConsultaCitasDisponiblesListaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasDisponiblesListaResponse")
    public ArrayOfString consultaCitasDisponiblesLista(
        @WebParam(name = "idPaciente", targetNamespace = "http://tempuri.org/")
        String idPaciente,
        @WebParam(name = "idEspecialidad", targetNamespace = "http://tempuri.org/")
        String idEspecialidad,
        @WebParam(name = "planSalud", targetNamespace = "http://tempuri.org/")
        String planSalud,
        @WebParam(name = "nombreUsuario", targetNamespace = "http://tempuri.org/")
        String nombreUsuario,
        @WebParam(name = "ciudadResidencia", targetNamespace = "http://tempuri.org/")
        String ciudadResidencia,
        @WebParam(name = "codigoIPS", targetNamespace = "http://tempuri.org/")
        String codigoIPS,
        @WebParam(name = "tipoConsulta", targetNamespace = "http://tempuri.org/")
        int tipoConsulta,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idPaciente
     * @param idLlamada
     * @param planSalud
     * @param ciudadResidencia
     * @param tipoConsulta
     * @param codigoIPS
     * @param nombreUsuario
     * @param mesCita
     * @param idEspecialidad
     * @param diaCita
     * @return
     *     returns org.tempuri.CitasDisponiblesModelIVR
     */
    @WebMethod(operationName = "ConsultaCitasDisponiblesFecha", action = "http://tempuri.org/ConsultaCitasDisponiblesFecha")
    @WebResult(name = "ConsultaCitasDisponiblesFechaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCitasDisponiblesFecha", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasDisponiblesFecha")
    @ResponseWrapper(localName = "ConsultaCitasDisponiblesFechaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasDisponiblesFechaResponse")
    public CitasDisponiblesModelIVR consultaCitasDisponiblesFecha(
        @WebParam(name = "idPaciente", targetNamespace = "http://tempuri.org/")
        String idPaciente,
        @WebParam(name = "idEspecialidad", targetNamespace = "http://tempuri.org/")
        String idEspecialidad,
        @WebParam(name = "planSalud", targetNamespace = "http://tempuri.org/")
        String planSalud,
        @WebParam(name = "nombreUsuario", targetNamespace = "http://tempuri.org/")
        String nombreUsuario,
        @WebParam(name = "ciudadResidencia", targetNamespace = "http://tempuri.org/")
        String ciudadResidencia,
        @WebParam(name = "codigoIPS", targetNamespace = "http://tempuri.org/")
        String codigoIPS,
        @WebParam(name = "tipoConsulta", targetNamespace = "http://tempuri.org/")
        int tipoConsulta,
        @WebParam(name = "diaCita", targetNamespace = "http://tempuri.org/")
        int diaCita,
        @WebParam(name = "mesCita", targetNamespace = "http://tempuri.org/")
        int mesCita,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idPaciente
     * @param idLlamada
     * @param planSalud
     * @param ciudadResidencia
     * @param tipoConsulta
     * @param codigoIPS
     * @param nombreUsuario
     * @param mesCita
     * @param idEspecialidad
     * @param diaCita
     * @return
     *     returns org.tempuri.ArrayOfString
     */
    @WebMethod(operationName = "ConsultaCitasDisponiblesFechaLista", action = "http://tempuri.org/ConsultaCitasDisponiblesFechaLista")
    @WebResult(name = "ConsultaCitasDisponiblesFechaListaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCitasDisponiblesFechaLista", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasDisponiblesFechaLista")
    @ResponseWrapper(localName = "ConsultaCitasDisponiblesFechaListaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsultaCitasDisponiblesFechaListaResponse")
    public ArrayOfString consultaCitasDisponiblesFechaLista(
        @WebParam(name = "idPaciente", targetNamespace = "http://tempuri.org/")
        String idPaciente,
        @WebParam(name = "idEspecialidad", targetNamespace = "http://tempuri.org/")
        String idEspecialidad,
        @WebParam(name = "planSalud", targetNamespace = "http://tempuri.org/")
        String planSalud,
        @WebParam(name = "nombreUsuario", targetNamespace = "http://tempuri.org/")
        String nombreUsuario,
        @WebParam(name = "ciudadResidencia", targetNamespace = "http://tempuri.org/")
        String ciudadResidencia,
        @WebParam(name = "codigoIPS", targetNamespace = "http://tempuri.org/")
        String codigoIPS,
        @WebParam(name = "tipoConsulta", targetNamespace = "http://tempuri.org/")
        int tipoConsulta,
        @WebParam(name = "diaCita", targetNamespace = "http://tempuri.org/")
        int diaCita,
        @WebParam(name = "mesCita", targetNamespace = "http://tempuri.org/")
        int mesCita,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idCita
     * @param idLlamada
     * @param idAfiliado
     * @param ciudadResidencia
     * @param planSalud
     * @param numeroIdentificacion
     * @param subCodigoIPS
     * @param estadoAfiliado
     * @param codigoIPS
     * @param citaDirecta
     * @param idEspecialidad
     * @param tieneCita
     * @return
     *     returns org.tempuri.AsignarCitaModelIVR
     */
    @WebMethod(operationName = "AsignacionCitas", action = "http://tempuri.org/AsignacionCitas")
    @WebResult(name = "AsignacionCitasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AsignacionCitas", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AsignacionCitas")
    @ResponseWrapper(localName = "AsignacionCitasResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AsignacionCitasResponse")
    public AsignarCitaModelIVR asignacionCitas(
        @WebParam(name = "idCita", targetNamespace = "http://tempuri.org/")
        String idCita,
        @WebParam(name = "idEspecialidad", targetNamespace = "http://tempuri.org/")
        String idEspecialidad,
        @WebParam(name = "numeroIdentificacion", targetNamespace = "http://tempuri.org/")
        String numeroIdentificacion,
        @WebParam(name = "idAfiliado", targetNamespace = "http://tempuri.org/")
        String idAfiliado,
        @WebParam(name = "ciudadResidencia", targetNamespace = "http://tempuri.org/")
        String ciudadResidencia,
        @WebParam(name = "estadoAfiliado", targetNamespace = "http://tempuri.org/")
        int estadoAfiliado,
        @WebParam(name = "tieneCita", targetNamespace = "http://tempuri.org/")
        int tieneCita,
        @WebParam(name = "codigoIPS", targetNamespace = "http://tempuri.org/")
        String codigoIPS,
        @WebParam(name = "subCodigoIPS", targetNamespace = "http://tempuri.org/")
        String subCodigoIPS,
        @WebParam(name = "planSalud", targetNamespace = "http://tempuri.org/")
        String planSalud,
        @WebParam(name = "citaDirecta", targetNamespace = "http://tempuri.org/")
        int citaDirecta,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idCita
     * @param idLlamada
     * @param idAfiliado
     * @param ciudadResidencia
     * @param planSalud
     * @param numeroIdentificacion
     * @param subCodigoIPS
     * @param estadoAfiliado
     * @param codigoIPS
     * @param citaDirecta
     * @param idEspecialidad
     * @param tieneCita
     * @return
     *     returns org.tempuri.ArrayOfString
     */
    @WebMethod(operationName = "AsignacionCitasLista", action = "http://tempuri.org/AsignacionCitasLista")
    @WebResult(name = "AsignacionCitasListaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AsignacionCitasLista", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AsignacionCitasLista")
    @ResponseWrapper(localName = "AsignacionCitasListaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AsignacionCitasListaResponse")
    public ArrayOfString asignacionCitasLista(
        @WebParam(name = "idCita", targetNamespace = "http://tempuri.org/")
        String idCita,
        @WebParam(name = "idEspecialidad", targetNamespace = "http://tempuri.org/")
        String idEspecialidad,
        @WebParam(name = "numeroIdentificacion", targetNamespace = "http://tempuri.org/")
        String numeroIdentificacion,
        @WebParam(name = "idAfiliado", targetNamespace = "http://tempuri.org/")
        String idAfiliado,
        @WebParam(name = "ciudadResidencia", targetNamespace = "http://tempuri.org/")
        String ciudadResidencia,
        @WebParam(name = "estadoAfiliado", targetNamespace = "http://tempuri.org/")
        int estadoAfiliado,
        @WebParam(name = "tieneCita", targetNamespace = "http://tempuri.org/")
        int tieneCita,
        @WebParam(name = "codigoIPS", targetNamespace = "http://tempuri.org/")
        String codigoIPS,
        @WebParam(name = "subCodigoIPS", targetNamespace = "http://tempuri.org/")
        String subCodigoIPS,
        @WebParam(name = "planSalud", targetNamespace = "http://tempuri.org/")
        String planSalud,
        @WebParam(name = "citaDirecta", targetNamespace = "http://tempuri.org/")
        int citaDirecta,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idCita
     * @param idLlamada
     * @param idAfiliado
     * @return
     *     returns org.tempuri.CancelarCitaModelIVR
     */
    @WebMethod(operationName = "CancelarCitas", action = "http://tempuri.org/CancelarCitas")
    @WebResult(name = "CancelarCitasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelarCitas", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelarCitas")
    @ResponseWrapper(localName = "CancelarCitasResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelarCitasResponse")
    public CancelarCitaModelIVR cancelarCitas(
        @WebParam(name = "idAfiliado", targetNamespace = "http://tempuri.org/")
        String idAfiliado,
        @WebParam(name = "idCita", targetNamespace = "http://tempuri.org/")
        String idCita,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idCita
     * @param idLlamada
     * @param idAfiliado
     * @return
     *     returns org.tempuri.ArrayOfString
     */
    @WebMethod(operationName = "CancelarCitasLista", action = "http://tempuri.org/CancelarCitasLista")
    @WebResult(name = "CancelarCitasListaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelarCitasLista", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelarCitasLista")
    @ResponseWrapper(localName = "CancelarCitasListaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelarCitasListaResponse")
    public ArrayOfString cancelarCitasLista(
        @WebParam(name = "idAfiliado", targetNamespace = "http://tempuri.org/")
        String idAfiliado,
        @WebParam(name = "idCita", targetNamespace = "http://tempuri.org/")
        String idCita,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param tipoDocumento
     * @param idLlamada
     * @param numeroDocumento
     * @return
     *     returns org.tempuri.EnviarCertificadoModelIVR
     */
    @WebMethod(operationName = "EnviarCertificadoAfiliado", action = "http://tempuri.org/EnviarCertificadoAfiliado")
    @WebResult(name = "EnviarCertificadoAfiliadoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "EnviarCertificadoAfiliado", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EnviarCertificadoAfiliado")
    @ResponseWrapper(localName = "EnviarCertificadoAfiliadoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EnviarCertificadoAfiliadoResponse")
    public EnviarCertificadoModelIVR enviarCertificadoAfiliado(
        @WebParam(name = "tipoDocumento", targetNamespace = "http://tempuri.org/")
        int tipoDocumento,
        @WebParam(name = "numeroDocumento", targetNamespace = "http://tempuri.org/")
        String numeroDocumento,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param tipoDocumento
     * @param idLlamada
     * @param numeroDocumento
     * @return
     *     returns org.tempuri.ArrayOfString
     */
    @WebMethod(operationName = "EnviarCertificadoAfiliadoLista", action = "http://tempuri.org/EnviarCertificadoAfiliadoLista")
    @WebResult(name = "EnviarCertificadoAfiliadoListaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "EnviarCertificadoAfiliadoLista", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EnviarCertificadoAfiliadoLista")
    @ResponseWrapper(localName = "EnviarCertificadoAfiliadoListaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EnviarCertificadoAfiliadoListaResponse")
    public ArrayOfString enviarCertificadoAfiliadoLista(
        @WebParam(name = "tipoDocumento", targetNamespace = "http://tempuri.org/")
        int tipoDocumento,
        @WebParam(name = "numeroDocumento", targetNamespace = "http://tempuri.org/")
        String numeroDocumento,
        @WebParam(name = "idLlamada", targetNamespace = "http://tempuri.org/")
        String idLlamada);

    /**
     * 
     * @param idCita
     * @param varExtendido
     * @return
     *     returns org.tempuri.CancelarCitaModelIVR
     */
    @WebMethod(operationName = "CancelarCitasSMS", action = "http://tempuri.org/CancelarCitasSMS")
    @WebResult(name = "CancelarCitasSMSResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelarCitasSMS", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelarCitasSMS")
    @ResponseWrapper(localName = "CancelarCitasSMSResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelarCitasSMSResponse")
    public CancelarCitaModelIVR cancelarCitasSMS(
        @WebParam(name = "idCita", targetNamespace = "http://tempuri.org/")
        String idCita,
        @WebParam(name = "varExtendido", targetNamespace = "http://tempuri.org/")
        String varExtendido);

    /**
     * 
     * @param mesCita
     * @param diaCita
     * @return
     *     returns org.tempuri.ArrayOfString
     */
    @WebMethod(operationName = "ValidaFechaCita", action = "http://tempuri.org/ValidaFechaCita")
    @WebResult(name = "ValidaFechaCitaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ValidaFechaCita", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ValidaFechaCita")
    @ResponseWrapper(localName = "ValidaFechaCitaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ValidaFechaCitaResponse")
    public ArrayOfString validaFechaCita(
        @WebParam(name = "diaCita", targetNamespace = "http://tempuri.org/")
        int diaCita,
        @WebParam(name = "mesCita", targetNamespace = "http://tempuri.org/")
        int mesCita);

}
