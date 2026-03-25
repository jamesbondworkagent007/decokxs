package o;

import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.BotGuideItem;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.vna, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51467vna {
    public final java.util.ArrayList<BotGuideData> AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<BotGuideData> EZpvd() {
        return this.AEQbTJ;
    }

    public C51467vna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.AEQbTJ = new java.util.ArrayList<>();
    }

    public final C51467vna OLrzqt(int i, int i2, int i3, int i4, java.lang.Integer num, java.lang.Integer num2) {
        BotGuideLinkItem botGuideLinkItem;
        java.util.ArrayList<BotGuideData> arrayList = this.AEQbTJ;
        java.lang.String str = this.EZpvd;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(i);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(i2);
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(i3);
        java.util.List listEZpvd = C56402yEa.EZpvd(new BotGuideItem(null, C33070mpX.AYXKKw(i4), 1, null));
        java.lang.String strAYXKKw4 = num != null ? C33070mpX.AYXKKw(num.intValue()) : null;
        if (strAYXKKw4 == null) {
            strAYXKKw4 = "";
        }
        java.lang.String str2 = strAYXKKw4;
        if (num2 != null) {
            botGuideLinkItem = new BotGuideLinkItem(C33070mpX.AYXKKw(C55688xof.Application.onScrollChanged), C33070mpX.AYXKKw(num2.intValue()));
        } else {
            botGuideLinkItem = new BotGuideLinkItem(null, null, 3, null);
        }
        arrayList.add(new BotGuideData(null, strAYXKKw, str2, str, listEZpvd, botGuideLinkItem, null, 0, strAYXKKw3, strAYXKKw2, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, null));
        return this;
    }

    public final C51467vna copydefault(int i, int i2, int i3, int i4, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<BotGuideData> arrayList = this.AEQbTJ;
        java.lang.String str2 = this.EZpvd;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(i);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(i2);
        arrayList.add(new BotGuideData(null, strAYXKKw, null, str2, C56402yEa.EZpvd(new BotGuideItem(null, C33070mpX.AYXKKw(i4), 1, null)), new BotGuideLinkItem(C33070mpX.AYXKKw(C55688xof.Application.onScrollChanged), str), null, 0, C33070mpX.AYXKKw(i3), strAYXKKw2, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, null));
        return this;
    }
}
