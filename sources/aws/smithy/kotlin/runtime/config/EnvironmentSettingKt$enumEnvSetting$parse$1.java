package aws.smithy.kotlin.runtime.config;

import androidx.exifinterface.media.ExifInterface;
import aws.smithy.kotlin.runtime.ClientException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
public final class EnvironmentSettingKt$enumEnvSetting$parse$1<T> extends Lambda implements Function1<String, T> {
    public static final EnvironmentSettingKt$enumEnvSetting$parse$1 INSTANCE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        Intrinsics.OLrzqt();
        INSTANCE = new EnvironmentSettingKt$enumEnvSetting$parse$1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EnvironmentSettingKt$enumEnvSetting$parse$1() {
        super(1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final Enum invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.KWHzl(5, ExifInterface.GPS_DIRECTION_TRUE);
        throw new ClientException("Value " + str + " is not supported, should be one of " + yDV.joinToString$default(new Enum[0], ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
    }
}
