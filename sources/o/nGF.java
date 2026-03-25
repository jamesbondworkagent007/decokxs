package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationCategory;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import o.C52761wXj;
import o.sDX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class nGF extends nGE {
    public final rXL AhwBna;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = rXL.EZpvd;
    public static final java.lang.String AYXKKw = "price_alerts_conversation";
    public static final java.lang.String valueOf = "notification_conversation";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.nGE
    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        return copydefault(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rXL djBIcL() {
        return this.AhwBna;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nGF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nGF(@NotNull android.content.Context context, @NotNull OKConversation oKConversation, rXL rxl) {
        super(context, oKConversation);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.AhwBna = rxl;
        copydefault(oKConversation);
    }

    public static /* synthetic */ java.lang.Object copydefault(nGF ngf, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public final java.lang.String AhwBna() {
        java.lang.String strCopydefault;
        rXL rxl = this.AhwBna;
        return (rxl == null || (strCopydefault = rxl.copydefault()) == null) ? C33070mpX.AYXKKw(sDX.StateListAnimator.getNewProxyInstance) : strCopydefault;
    }

    public final int valueOf() {
        rXL rxl = this.AhwBna;
        return rxl != null ? rxl.OLrzqt() : C52761wXj.TaskDescription.UeEOUB;
    }

    public final java.lang.String EZpvd() {
        java.lang.String targetId = AEQbTJ().getTargetId();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = targetId.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) upperCase, (java.lang.CharSequence) NotificationCategory.PriceAlerts.getValue(), false, 2, (java.lang.Object) null)) {
            return AYXKKw;
        }
        java.lang.String upperCase2 = AEQbTJ().getTargetId().toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) upperCase2, (java.lang.CharSequence) "NOTIFICATION", false, 2, (java.lang.Object) null) ? valueOf : "other_notification_conversation";
    }

    public void copydefault(@NotNull OKConversation oKConversation) {
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
