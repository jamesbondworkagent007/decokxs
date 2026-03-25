package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.ChainAddress;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10186bjh {
    public static final C10186bjh KWHzl = new C10186bjh();

    private C10186bjh() {
    }

    public final void KWHzl(@NotNull android.content.Context context, long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (AEQbTJ(str2, j)) {
            java.lang.Object systemService = context.getSystemService("clipboard");
            android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str2));
            C19595gIe.Companion.AEQbTJ(str, str2).KWHzl(context);
        }
    }

    public final boolean AEQbTJ(final java.lang.String str, long j) {
        final AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        if (abstractC12782ctV == null) {
            return true;
        }
        Function0 function0 = new Function0() { // from class: o.bje
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C10186bjh.OLrzqt(abstractC12782ctV, str));
            }
        };
        if ((abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) && abstractC12782ctV.DCUTEIdCUTEI()) {
            if (!((java.lang.Boolean) function0.invoke()).booleanValue()) {
                return true;
            }
            C55326xho.toast$default(C13754dXa.FragmentManager.AlertDialogBuilder, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            if (abstractC12782ctV.zLjUOn() || !((java.lang.Boolean) function0.invoke()).booleanValue()) {
                return true;
            }
            C55326xho.toast$default(C13754dXa.FragmentManager.HJWChPdIKEqB, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return false;
    }

    public static final boolean OLrzqt(AbstractC12782ctV abstractC12782ctV, java.lang.String str) {
        java.lang.Object next;
        java.util.Iterator<T> it = abstractC12782ctV.EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ChainAddress) next).getAddress())) {
                break;
            }
        }
        return next != null;
    }

    public static /* synthetic */ java.lang.CharSequence jointColorCharSequence$default(C10186bjh c10186bjh, java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = null;
        }
        if ((i3 & 2) != 0) {
            i = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        if ((i3 & 4) != 0) {
            charSequence2 = null;
        }
        if ((i3 & 8) != 0) {
            i2 = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        return c10186bjh.copydefault(charSequence, i, charSequence2, i2);
    }

    public final java.lang.CharSequence copydefault(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2) {
        java.lang.CharSequence charSequence3;
        java.lang.CharSequence charSequence4;
        if (C33129mqd.OLrzqt(charSequence)) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i), 0, spannableStringBuilder.length(), 17);
            charSequence3 = spannableStringBuilder;
        } else {
            charSequence3 = "";
        }
        if (C33129mqd.OLrzqt(charSequence2)) {
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(charSequence2);
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(i2), 0, spannableStringBuilder2.length(), 17);
            charSequence4 = spannableStringBuilder2;
        } else {
            charSequence4 = "";
        }
        android.text.SpannableStringBuilder spannableStringBuilderAppend = new android.text.SpannableStringBuilder().append(charSequence3).append(charSequence4);
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, "");
        return spannableStringBuilderAppend;
    }
}
