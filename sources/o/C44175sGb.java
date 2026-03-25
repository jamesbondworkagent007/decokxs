package o;

import android.content.SharedPreferences;
import com.okinc.okimcore.feature.cache.user.UserCacheImpl$observeUserInfoFlow$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sGb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44175sGb implements sFZ {
    public final InterfaceC56387yDm AEQbTJ;
    public com.okinc.okimcore.model.remote.UserInfo KWHzl;
    public final java.lang.String OLrzqt;

    @yCM
    public C44175sGb(@NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "user_cache";
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sGa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44175sGb.KWHzl(context, this);
            }
        });
    }

    public final android.content.SharedPreferences copydefault() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.content.SharedPreferences) value;
    }

    public static final android.content.SharedPreferences KWHzl(android.content.Context context, C44175sGb c44175sGb) {
        return context.getSharedPreferences(c44175sGb.OLrzqt, 0);
    }

    @Override // o.sFZ
    public void EZpvd(@NotNull com.okinc.okimcore.model.remote.UserInfo userInfo) {
        SharedPreferences.Editor editorPutString;
        Intrinsics.checkNotNullParameter(userInfo, "");
        this.KWHzl = userInfo;
        if (C44157sFk.gEmmrt().values()) {
            java.lang.String strCopydefault = C44157sFk.copydefault(C44157sFk.gEmmrt());
            java.lang.String strKWHzl = C33489mxS.KWHzl.KWHzl(com.okinc.okimcore.model.remote.UserInfo.Companion.serializer(), userInfo);
            SharedPreferences.Editor editorEdit = copydefault().edit();
            if (editorEdit == null || (editorPutString = editorEdit.putString(strCopydefault, strKWHzl)) == null) {
                return;
            }
            editorPutString.apply();
        }
    }

    @Override // o.sFZ
    public com.okinc.okimcore.model.remote.UserInfo OLrzqt() {
        if (!C44157sFk.gEmmrt().values()) {
            this.KWHzl = null;
            return null;
        }
        java.lang.String string = copydefault().getString(C44157sFk.copydefault(C44157sFk.gEmmrt()), "");
        java.lang.String str = string != null ? string : "";
        com.okinc.okimcore.model.remote.UserInfo userInfo = C33129mqd.OLrzqt((java.lang.CharSequence) str) ? (com.okinc.okimcore.model.remote.UserInfo) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) com.okinc.okimcore.model.remote.UserInfo.Companion.serializer(), str) : null;
        this.KWHzl = userInfo;
        return userInfo;
    }

    @Override // o.sFZ
    public Flow<com.okinc.okimcore.model.remote.UserInfo> AEQbTJ() {
        return FlowKt.callbackFlow(new UserCacheImpl$observeUserInfoFlow$1(this, null));
    }
}
