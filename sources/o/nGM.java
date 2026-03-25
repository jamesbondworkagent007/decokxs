package o;

import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nGM extends nGE {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return C52761wXj.TaskDescription.HJWChPdIKEqB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return "orbit_update_conversation";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nGM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nGM(@NotNull android.content.Context context, @NotNull OKConversation oKConversation) {
        super(context, oKConversation);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        AEQbTJ(oKConversation);
    }

    @Override // o.nGE
    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public final java.lang.String AYXKKw() {
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.DbvGUJ);
    }

    public void AEQbTJ(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        OLrzqt(oKConversation);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String extra = AEQbTJ().getExtra();
        if (extra != null) {
            java.lang.Object obj = JsonElementKt.getJsonObject(Json.Default.parseToJsonElement(extra)).get((java.lang.Object) "lastMessage");
            JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
            spannableStringBuilder.append((java.lang.CharSequence) (jsonPrimitive != null ? jsonPrimitive.getContent() : null));
        }
        KWHzl(spannableStringBuilder);
    }
}
