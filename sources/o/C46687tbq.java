package o;

import com.okinc.core.util.SPUtils;
import com.okinc.core.util.format.MatchPattern;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.uilab.util.SpanUtils;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C43035rhg;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46687tbq implements InterfaceC43030rhb {
    public static final C46687tbq KWHzl = new C46687tbq();

    private C46687tbq() {
    }

    @Override // o.InterfaceC43030rhb
    public AbstractC32996moC copydefault() {
        return new C34877nkj();
    }

    @Override // o.InterfaceC43030rhb
    public boolean AEQbTJ() {
        return !EZpvd();
    }

    public final boolean EZpvd() {
        boolean zAEQbTJ = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.CR_TWITTER);
        pUU.KWHzl("MarketFragmentManager", "isHideFeedCommunityConfig -> CR_TWITTER = " + zAEQbTJ);
        return zAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    @Override // o.InterfaceC43030rhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Triple<AbstractC32996moC, java.lang.CharSequence, java.lang.String> AEQbTJ(@NotNull java.lang.String str) {
        java.lang.CharSequence charSequence;
        final android.graphics.drawable.Drawable drawableKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (!AEQbTJ()) {
            return new Triple<>(null, "", "");
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.hBpjJd);
        if (!SPUtils.getBoolean("KLINE_USER_VISITED_FEED", false) && (drawableKWHzl = C33070mpX.KWHzl(C43035rhg.ActionBar.OLrzqt)) != null) {
            charSequence = C33574myy.setupSpanStyles$default(strAYXKKw + " ", new java.lang.String[]{" "}, 0, MatchPattern.LAST_ONLY, false, new Function1() { // from class: o.tbx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46687tbq.EZpvd(drawableKWHzl, (java.util.List) obj);
                }
            }, 10, null);
            if (charSequence == null) {
                charSequence = strAYXKKw;
            }
        }
        return new Triple<>(C34829njo.Companion.OLrzqt(str), charSequence, strAYXKKw);
    }

    public static final Unit EZpvd(android.graphics.drawable.Drawable drawable, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new SpanUtils.Activity(drawable, 3));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC43030rhb
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC34759niX.class);
        intent.putExtra("title", str);
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("data", str2);
        context.startActivity(intent);
    }
}
