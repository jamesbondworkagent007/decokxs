package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sIq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC44244sIq<T> {
    public final KSerializer<T> AEQbTJ;

    public AbstractC44244sIq(@NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.AEQbTJ = kSerializer;
    }

    public final java.lang.String OLrzqt(T t) {
        if (t != null) {
            try {
                return sHW.copydefault().KWHzl().encodeToString(this.AEQbTJ, t);
            } catch (java.lang.Exception e) {
                pUU.copydefault("InHouseDbConverter", "fromType error: " + e.getMessage());
                sSR.copydefault("IMDbConverter fromType Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
            }
        }
        return null;
    }

    public final T KWHzl(java.lang.String str) {
        if (str != null) {
            try {
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                    return (T) sHW.copydefault().KWHzl().decodeFromString(this.AEQbTJ, str);
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("InHouseDbConverter", "toType error: " + e.getMessage());
                sSR.copydefault("IMDbConverter toType Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
            }
        }
        return null;
    }

    public final java.lang.String OLrzqt(java.util.List<? extends T> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    try {
                        return sHW.copydefault().KWHzl().encodeToString(BuiltinSerializersKt.ListSerializer(this.AEQbTJ), list);
                    } catch (java.lang.Exception e) {
                        pUU.copydefault("SafeJson", "encodeToString with multiple parameters error: " + e.getMessage());
                        sSR.copydefault("encodeToString with multiple parameters Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                        return "";
                    }
                }
            } catch (java.lang.Exception e2) {
                pUU.copydefault("InHouseDbConverter", "fromListToJson error: " + e2.getMessage());
                sSR.copydefault("IMDbConverter fromListToJson Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
            }
        }
        return null;
    }

    public final java.util.List<T> AEQbTJ(java.lang.String str) {
        java.lang.Object objDecodeFromString;
        if (str == null) {
            return null;
        }
        try {
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                return null;
            }
            try {
                objDecodeFromString = sHW.copydefault().KWHzl().decodeFromString(BuiltinSerializersKt.ListSerializer(this.AEQbTJ), str);
            } catch (SerializationException e) {
                pUU.copydefault("SafeJson", "decodeFromString with multiple parameters SerializationException: " + e.getMessage());
                sSR.copydefault("decodeFromString with multiple parameters SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                objDecodeFromString = null;
            } catch (java.lang.Exception e2) {
                pUU.copydefault("SafeJson", "decodeFromString with multiple parameters error: " + e2.getMessage());
                sSR.copydefault("decodeFromString with multiple parameters Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
                objDecodeFromString = null;
            }
            return (java.util.List) objDecodeFromString;
        } catch (java.lang.Exception e3) {
            pUU.copydefault("InHouseDbConverter", "fromJsonToList error: " + e3.getMessage());
            sSR.copydefault("IMDbConverter fromJsonToList Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e3.getMessage()))));
            return null;
        }
    }
}
