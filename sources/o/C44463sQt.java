package o;

import com.okinc.okimcore.model.other.InfoNtfExtraData;
import kotlinx.serialization.DeserializationStrategy;

/* JADX INFO: renamed from: o.sQt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44463sQt {
    public static final InfoNtfExtraData OLrzqt(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return (InfoNtfExtraData) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) InfoNtfExtraData.Companion.serializer(), str);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
