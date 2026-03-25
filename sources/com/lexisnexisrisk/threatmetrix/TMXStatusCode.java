package com.lexisnexisrisk.threatmetrix;

import org.spongycastle.crypto.tls.CipherSuite;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class TMXStatusCode {
    public static int RHc = 5880;
    public static int kJW = 9181;
    private final String QMfgOI;
    private final String iKLYzd;
    public static final TMXStatusCode TMX_NotYet = new TMXStatusCode("TMX_NotYet", 0, "Not Yet", "TMXProfile request has started successfully but has not completed");
    public static final TMXStatusCode TMX_OK = new TMXStatusCode("TMX_OK", 1, "Okay", "Completed, No errors");
    public static final TMXStatusCode TMX_Connection_Error = new TMXStatusCode("TMX_Connection_Error", 2, "Connection Error", "There was a connection issue, profiling aborted");
    public static final TMXStatusCode TMX_HostNotFound_Error = new TMXStatusCode("TMX_HostNotFound_Error", 3, "Host Not Found", "Unable to resolve the host name");
    public static final TMXStatusCode TMX_NetworkTimeout_Error = new TMXStatusCode("TMX_NetworkTimeout_Error", 4, "Network Timeout", "Communications layer timed out");
    public static final TMXStatusCode TMX_Internal_Error = new TMXStatusCode("TMX_Internal_Error", 5, "Internal Error", "Internal Error, profiling incomplete or interrupted");
    public static final TMXStatusCode TMX_HostVerification_Error = new TMXStatusCode("TMX_HostVerification_Error", 6, "Host Verification Error", "Certificate verification failure! Potential MITM attack");
    public static final TMXStatusCode TMX_Interrupted_Error = new TMXStatusCode("TMX_Interrupted_Error", 7, "Interrupted", "Request was cancelled");
    public static final TMXStatusCode TMX_ConfigurationError = new TMXStatusCode("TMX_ConfigurationError", 8, "Configuration Error", "Failed to retrieve configuration from server");
    public static final TMXStatusCode TMX_PartialProfile = new TMXStatusCode("TMX_PartialProfile", 9, "Partial TMXProfile", "Connection error, only partial profile completed");
    public static final TMXStatusCode TMX_Blocked = new TMXStatusCode("TMX_Blocked", 10, "Profiling is blocked", "Profiling is blocked.(Screen is off)");
    public static final TMXStatusCode TMX_EndNotifier_NotFound = new TMXStatusCode("TMX_EndNotifier_NotFound", 11, "TMXEndNotifier not found", "TMXEndNotifier is mandatory in profile request");
    public static final TMXStatusCode TMX_In_Quiet_Period = new TMXStatusCode("TMX_In_Quiet_Period", 12, "In Quiet Period", "Profiling is blocked (In Quiet Period)");
    public static final TMXStatusCode TMX_Certificate_Mismatch = new TMXStatusCode("TMX_Certificate_Mismatch", 13, "Certificate Mismatch", "The pinned certificate does not match the server's certificate");
    public static final TMXStatusCode TMX_StrongAuth_Failed = new TMXStatusCode("TMX_StrongAuth_Failed", 14, "Registration / Stepup failed", "System has rejected Registration / Stepup attempt");
    public static final TMXStatusCode TMX_StrongAuth_Cancelled = new TMXStatusCode("TMX_StrongAuth_Cancelled", 15, "Registration / Stepup was cancelled", "User has chosen not to proceed with Registration / Stepup");
    public static final TMXStatusCode TMX_StrongAuth_Unsupported = new TMXStatusCode("TMX_StrongAuth_Unsupported", 16, "Strong Auth Method Unsupported", "Hardware/OS does not support this functionality.");
    public static final TMXStatusCode TMX_StrongAuth_UserNotFound = new TMXStatusCode("TMX_StrongAuth_UserNotFound", 17, "User context not found", "User context is not registered on the device, Stepup failed");
    public static final TMXStatusCode TMX_StrongAuth_AlreadyRegistered = new TMXStatusCode("TMX_StrongAuth_AlreadyRegistered", 18, "User context already registered ", "User context is already registered on the device, Registration failed");
    public static final TMXStatusCode TMX_CertificateError = new TMXStatusCode("TMX_CertificateError", 19, "Certificate Error", "This exception indicates one of a variety of certificate problems");
    public static final TMXStatusCode TMX_CertificateEncodingError = new TMXStatusCode("TMX_CertificateEncodingError", 20, "Certificate Encoding Error", "Certificate Encoding Exception");
    public static final TMXStatusCode TMX_CertificateExpired = new TMXStatusCode("TMX_CertificateExpired", 21, "Certificate Expired", "Certificate Expired Exception");
    public static final TMXStatusCode TMX_CertificateNotYetValid = new TMXStatusCode("TMX_CertificateNotYetValid", 22, "Certificate is not yet valid", "Certificate is not yet valid exception");
    public static final TMXStatusCode TMX_CertificateParsingError = new TMXStatusCode("TMX_CertificateParsingError", 23, "Certificate Parsing Error", "Certificate Parsing Exception");
    public static final TMXStatusCode TMX_CertPathBuilderError = new TMXStatusCode("TMX_CertPathBuilderError", 24, "Certificate Path Build Error", "An exception indicating one of a variety of problems encountered when building a certification path with a CertPathBuilder");
    public static final TMXStatusCode TMX_CertPathValidatorError = new TMXStatusCode("TMX_CertPathValidatorError", 25, "Certificate Path Validator Error", "An exception indicating one of a variety of problems encountered when validating a certification path");
    public static final TMXStatusCode TMX_CertStoreError = new TMXStatusCode("TMX_CertStoreError", 26, "Certificate Store Error", "An exception indicating one of a variety of problems retrieving certificates and CRLs from a CertStore");
    public static final TMXStatusCode TMX_CRLError = new TMXStatusCode("TMX_CRLError", 27, "CRL Error", "Certificate Revocation List Exception");
    public static final TMXStatusCode TMX_ProfileTimeout_Error = new TMXStatusCode("TMX_ProfileTimeout_Error", 28, "TMXProfile Timeout", "Profiling timed out");
    private static final /* synthetic */ TMXStatusCode[] gkhjaB = gEmmrt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TMXStatusCode(String str, int i, String str2, String str3) {
        this.QMfgOI = str2;
        this.iKLYzd = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ TMXStatusCode[] gEmmrt() {
        TMXStatusCode[] tMXStatusCodeArr = new TMXStatusCode[29];
        tMXStatusCodeArr[0] = TMX_NotYet;
        tMXStatusCodeArr[1] = TMX_OK;
        tMXStatusCodeArr[2] = TMX_Connection_Error;
        tMXStatusCodeArr[3] = TMX_HostNotFound_Error;
        tMXStatusCodeArr[4] = TMX_NetworkTimeout_Error;
        tMXStatusCodeArr[5] = TMX_Internal_Error;
        tMXStatusCodeArr[6] = TMX_HostVerification_Error;
        tMXStatusCodeArr[7] = TMX_Interrupted_Error;
        tMXStatusCodeArr[8] = TMX_ConfigurationError;
        tMXStatusCodeArr[9] = TMX_PartialProfile;
        tMXStatusCodeArr[10] = TMX_Blocked;
        tMXStatusCodeArr[11] = TMX_EndNotifier_NotFound;
        tMXStatusCodeArr[12] = TMX_In_Quiet_Period;
        tMXStatusCodeArr[13] = TMX_Certificate_Mismatch;
        if ((kJW ^ 9181) != 0) {
            while (true) {
                int i = kJW;
                int i2 = i + 13;
                if (i2 == 98) {
                    break;
                }
                if (i2 == 124) {
                    while (true) {
                        kJW = (kJW % 23) >> 13;
                    }
                } else if (i2 == 291) {
                    kJW = i >> CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256;
                    break;
                }
            }
            kJW = ((kJW >> 19) ^ 2126) % 73;
        }
        tMXStatusCodeArr[14] = TMX_StrongAuth_Failed;
        tMXStatusCodeArr[15] = TMX_StrongAuth_Cancelled;
        tMXStatusCodeArr[16] = TMX_StrongAuth_Unsupported;
        tMXStatusCodeArr[17] = TMX_StrongAuth_UserNotFound;
        tMXStatusCodeArr[18] = TMX_StrongAuth_AlreadyRegistered;
        tMXStatusCodeArr[19] = TMX_CertificateError;
        tMXStatusCodeArr[20] = TMX_CertificateEncodingError;
        tMXStatusCodeArr[21] = TMX_CertificateExpired;
        tMXStatusCodeArr[22] = TMX_CertificateNotYetValid;
        tMXStatusCodeArr[23] = TMX_CertificateParsingError;
        tMXStatusCodeArr[24] = TMX_CertPathBuilderError;
        tMXStatusCodeArr[25] = TMX_CertPathValidatorError;
        tMXStatusCodeArr[26] = TMX_CertStoreError;
        tMXStatusCodeArr[27] = TMX_CRLError;
        tMXStatusCodeArr[28] = TMX_ProfileTimeout_Error;
        return tMXStatusCodeArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TMXStatusCode valueOf(String str) {
        return (TMXStatusCode) Enum.valueOf(TMXStatusCode.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TMXStatusCode[] values() {
        return (TMXStatusCode[]) gkhjaB.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDesc() {
        return this.iKLYzd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.QMfgOI;
    }
}
