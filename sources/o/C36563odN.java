package o;

import com.okinc.im.imui.messageV2.model.StringResource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36563odN {
    public static final java.lang.String AEQbTJ(@NotNull StringResource stringResource, @NotNull android.content.Context context) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(stringResource, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (stringResource instanceof StringResource.Raw) {
            string = ((StringResource.Raw) stringResource).EZpvd();
            if (string == null) {
                return "";
            }
        } else {
            if (!(stringResource instanceof StringResource.Res)) {
                throw new NoWhenBranchMatchedException();
            }
            string = context.getString(((StringResource.Res) stringResource).copydefault());
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        return string;
    }
}
