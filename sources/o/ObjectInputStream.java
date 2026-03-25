package o;

import aws.sdk.kotlin.runtime.ConfigurationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ObjectInputStream {
    public static final DL KWHzl(@NotNull ObjectOutputStream objectOutputStream, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(objectOutputStream, "");
        Intrinsics.checkNotNullParameter(str, "");
        DL dlCopydefault = copydefault(objectOutputStream, str);
        return dlCopydefault == null ? ObjectInputValidation.copydefault(objectOutputStream.OLrzqt()) : dlCopydefault;
    }

    public static final DL copydefault(ObjectOutputStream objectOutputStream, java.lang.String str) {
        java.lang.String strValueOf = ObjectInputValidation.valueOf(objectOutputStream.OLrzqt());
        if (strValueOf == null) {
            return null;
        }
        ObjectStreamField objectStreamField = objectOutputStream.EZpvd().get(strValueOf);
        if (objectStreamField == null) {
            throw new ConfigurationException("shared config points to nonexistent services section '" + strValueOf + '\'');
        }
        return ObjectInputValidation.EZpvd(objectStreamField, str, "endpoint_url");
    }
}
