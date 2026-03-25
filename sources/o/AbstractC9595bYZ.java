package o;

import com.okinc.business.defi.api.bean.SolDataFunction;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaTxResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.bYZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9595bYZ extends AbstractC12442cmy {
    public final java.lang.String copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9595bYZ(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
        super(oKWBaseTransaction);
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        this.copydefault = "SolanaSignContractBaseHandler";
    }

    public final JSONArray AEQbTJ(@NotNull JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("data");
        JSONArray jSONArrayOptJSONArray = (jSONObjectOptJSONObject4 == null || (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject4.optJSONObject("txSigned")) == null) ? null : jSONObjectOptJSONObject3.optJSONArray("data");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() <= 1168) {
            return jSONArrayOptJSONArray;
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject5 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject5.optJSONObject("v0")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("txSigned")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject2.optJSONArray("data");
    }

    public final void AEQbTJ(@NotNull JSONArray jSONArray, @NotNull final Function1<? super SolanaTxResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C54892xZe.KWHzl.KWHzl(C9678baC.Companion.AEQbTJ(), jSONArray, new android.webkit.ValueCallback() { // from class: o.bZb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                AbstractC9595bYZ.copydefault(this.KWHzl, function1, (java.lang.String) obj);
            }
        });
    }

    public static final void copydefault(AbstractC9595bYZ abstractC9595bYZ, Function1 function1, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            KSerializer<SolanaTxResult> kSerializerSerializer = SolanaTxResult.Companion.serializer();
            Intrinsics.copydefault((java.lang.Object) str);
            objM7377constructorimpl = Result.m7377constructorimpl((SolanaTxResult) C54907xZt.OLrzqt(kSerializerSerializer, str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        function1.invoke(objM7377constructorimpl);
    }

    public final void OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C54892xZe.KWHzl.AEQbTJ(C9678baC.Companion.AEQbTJ(), list, new android.webkit.ValueCallback() { // from class: o.bZd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                AbstractC9595bYZ.OLrzqt(function1, (java.lang.String) obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        function1.invoke(str);
    }

    public final void AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C54892xZe.KWHzl.copydefault(C9678baC.Companion.AEQbTJ(), list, new android.webkit.ValueCallback() { // from class: o.bYX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                AbstractC9595bYZ.copydefault(function1, (java.lang.String) obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        function1.invoke(str);
    }

    public final void KWHzl(@NotNull final java.util.List<java.lang.String> list, @NotNull final Function1<? super java.util.List<? extends java.util.List<SolDataFunction>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C54892xZe.KWHzl.OLrzqt(C9678baC.Companion.AEQbTJ(), list, new android.webkit.ValueCallback() { // from class: o.bZe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                AbstractC9595bYZ.EZpvd(function1, this, list, (java.lang.String) obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, AbstractC9595bYZ abstractC9595bYZ, java.util.List list, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        if (str == null || str.length() == 0) {
            function1.invoke(yDY.AhwBna());
            C10856bwO.EZpvd(abstractC9595bYZ.copydefault, new OKWException("SOL decode error " + list, null));
            return;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.ListSerializer(SolDataFunction.Companion.serializer())), str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.util.List listAhwBna = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        function1.invoke(listAhwBna);
    }
}
