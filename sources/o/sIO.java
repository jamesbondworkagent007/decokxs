package o;

import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* JADX INFO: loaded from: classes16.dex */
public final class sIO {
    public final java.lang.String OLrzqt(java.util.List<java.lang.String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        try {
            return sHW.copydefault().KWHzl().encodeToString(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl)), list);
        } catch (java.lang.Exception e) {
            pUU.copydefault("SafeJson", "encodeToString with multiple parameters error: " + e.getMessage());
            sSR.copydefault("encodeToString with multiple parameters Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
            return "";
        }
    }

    public final java.util.List<java.lang.String> OLrzqt(java.lang.String str) {
        java.lang.Object objDecodeFromString = null;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        try {
            objDecodeFromString = sHW.copydefault().KWHzl().decodeFromString(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl)), str);
        } catch (SerializationException e) {
            pUU.copydefault("SafeJson", "decodeFromString with multiple parameters SerializationException: " + e.getMessage());
            sSR.copydefault("decodeFromString with multiple parameters SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
        } catch (java.lang.Exception e2) {
            pUU.copydefault("SafeJson", "decodeFromString with multiple parameters error: " + e2.getMessage());
            sSR.copydefault("decodeFromString with multiple parameters Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
        }
        return (java.util.List) objDecodeFromString;
    }
}
