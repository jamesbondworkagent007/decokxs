package o;

import com.okinc.nft.util.StarknetUtil$loadStarknetJs$1;
import com.okinc.wallet.core.javascript.WalletJsBridge;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rtP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43654rtP {
    public static java.lang.String copydefault;
    public static final C43654rtP EZpvd = new C43654rtP();
    public static final int AEQbTJ = 8;

    private C43654rtP() {
    }

    public final void OLrzqt(@NotNull final java.lang.String str, final java.util.List<java.lang.String> list, final android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(new Function1() { // from class: o.rtO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43654rtP.EZpvd(valueCallback, list, str, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(android.webkit.ValueCallback valueCallback, java.util.List list, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (str2 == null) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue("");
            }
            return Unit.INSTANCE;
        }
        if (list == null || list.isEmpty()) {
            str3 = "\n                " + str + "();\n                ";
        } else {
            str3 = "\n                " + str + "(" + CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: o.rtN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43654rtP.EZpvd((java.lang.String) obj);
                }
            }, 30, null) + ");\n                ";
        }
        WalletJsBridge.AEQbTJ.KWHzl(C43246rlf.OLrzqt.valueOf(), str2, str3, valueCallback);
        return Unit.INSTANCE;
    }

    public static final java.lang.CharSequence EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "'" + str + "'";
    }

    public final void KWHzl(Function1<? super java.lang.String, Unit> function1) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) copydefault)) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new StarknetUtil$loadStarknetJs$1(function1, null), 2, null);
        } else {
            function1.invoke(copydefault);
        }
    }
}
