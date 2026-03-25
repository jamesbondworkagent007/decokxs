package com.okinc.tradingbot.impl.common.remoteimage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5449Sd;
import o.C33070mpX;
import o.C43454rpb;
import o.C48033uCm;
import o.C56444yFp;
import o.ComponentCallbacks2C5333Nr;
import o.InterfaceC5460So;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class CoinRemoteImage {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CoinRemoteImage[] $VALUES;
    public static final CoinRemoteImage ADA = new CoinRemoteImage("ADA", 0, "coin_filled_ada.png", false, 2, null);
    public static final CoinRemoteImage AVAX;
    public static final CoinRemoteImage BCH;
    private static final String BOT_PREFIX = "images/trading_bot/";
    public static final CoinRemoteImage BTC;
    public static final StateListAnimator Companion;
    public static final CoinRemoteImage DOGE;
    public static final CoinRemoteImage DOT;
    public static final CoinRemoteImage ETC;
    public static final CoinRemoteImage ETH;
    public static final CoinRemoteImage FIL;
    public static final CoinRemoteImage LINK;
    public static final CoinRemoteImage LTC;
    public static final CoinRemoteImage SOL;
    public static final CoinRemoteImage SUI;
    public static final CoinRemoteImage TRX;
    public static final CoinRemoteImage UNI;
    public static final CoinRemoteImage USDT;
    public static final CoinRemoteImage XPR;
    private static final Map<String, Drawable> cache;
    private final boolean isDarkSupported;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CoinRemoteImage[] $values() {
        return new CoinRemoteImage[]{ADA, AVAX, BCH, BTC, DOGE, DOT, ETC, ETH, FIL, LINK, LTC, SOL, SUI, TRX, UNI, USDT, XPR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CoinRemoteImage> getEntries() {
        return $ENTRIES;
    }

    private CoinRemoteImage(String str, int i, String str2, boolean z) {
        this.url = str2;
        this.isDarkSupported = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (r3v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, int, java.lang.String, boolean):void (m)] (LINE:13) call: com.okinc.tradingbot.impl.common.remoteimage.CoinRemoteImage.<init>(java.lang.String, int, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ CoinRemoteImage(String str, int i, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? false : z);
    }

    static {
        boolean z = false;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AVAX = new CoinRemoteImage("AVAX", 1, "coin_filled_avax.png", z, i, defaultConstructorMarker);
        boolean z2 = false;
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        BCH = new CoinRemoteImage("BCH", 2, "coin_filled_bch.png", z2, i2, defaultConstructorMarker2);
        BTC = new CoinRemoteImage("BTC", 3, "coin_filled_btc.png", z, i, defaultConstructorMarker);
        DOGE = new CoinRemoteImage("DOGE", 4, "coin_filled_doge.png", z2, i2, defaultConstructorMarker2);
        DOT = new CoinRemoteImage("DOT", 5, "coin_filled_dot.png", z, i, defaultConstructorMarker);
        ETC = new CoinRemoteImage("ETC", 6, "coin_filled_etc.png", z2, i2, defaultConstructorMarker2);
        ETH = new CoinRemoteImage("ETH", 7, "coin_filled_eth.png", z, i, defaultConstructorMarker);
        FIL = new CoinRemoteImage("FIL", 8, "coin_filled_fil.png", z2, i2, defaultConstructorMarker2);
        LINK = new CoinRemoteImage("LINK", 9, "coin_filled_link.png", z, i, defaultConstructorMarker);
        LTC = new CoinRemoteImage("LTC", 10, "coin_filled_ltc.png", z2, i2, defaultConstructorMarker2);
        SOL = new CoinRemoteImage("SOL", 11, "coin_filled_sol.png", z, i, defaultConstructorMarker);
        SUI = new CoinRemoteImage("SUI", 12, "coin_filled_sui.png", z2, i2, defaultConstructorMarker2);
        TRX = new CoinRemoteImage("TRX", 13, "coin_filled_trx.png", z, i, defaultConstructorMarker);
        UNI = new CoinRemoteImage("UNI", 14, "coin_filled_uni.png", z2, i2, defaultConstructorMarker2);
        USDT = new CoinRemoteImage("USDT", 15, "coin_filled_usdt.png", z, i, defaultConstructorMarker);
        XPR = new CoinRemoteImage("XPR", 16, "coin_filled_xpr.png", z2, i2, defaultConstructorMarker2);
        CoinRemoteImage[] coinRemoteImageArr$values = $values();
        $VALUES = coinRemoteImageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(coinRemoteImageArr$values);
        Companion = new StateListAnimator(null);
        cache = new LinkedHashMap();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.common.remoteimage.CoinRemoteImage.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void loadRemoteCoinImage$default(StateListAnimator stateListAnimator, TabLayout.Tab tab, String str, Drawable drawable, int i, Object obj) {
            if ((i & 2) != 0) {
                drawable = C33070mpX.KWHzl(C48033uCm.ActionBar.AkhnZx);
            }
            stateListAnimator.KWHzl(tab, str, drawable);
        }

        public static final void OLrzqt(TabLayout.Tab tab, Drawable drawable) {
            if (tab.parent != null) {
                tab.setIcon(drawable);
            }
        }

        public final void KWHzl(@NotNull TabLayout.Tab tab, String str, Drawable drawable) {
            CoinRemoteImage next;
            Intrinsics.checkNotNullParameter(tab, "");
            if (CoinRemoteImage.cache.containsKey(str)) {
                OLrzqt(tab, (Drawable) CoinRemoteImage.cache.get(str));
                return;
            }
            Iterator<CoinRemoteImage> it = CoinRemoteImage.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) next.name(), (Object) str)) {
                        break;
                    }
                }
            }
            CoinRemoteImage coinRemoteImage = next;
            if (coinRemoteImage != null) {
                ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(tab.view.getContext());
                Context context = tab.view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (((C0640StateListAnimator) componentCallbacks2C5333NrAEQbTJ.EZpvd(coinRemoteImage.getUrl(context)).AEQbTJ(drawable).OLrzqt(new C0640StateListAnimator(coinRemoteImage, tab))) != null) {
                    return;
                }
            }
            OLrzqt(tab, drawable);
            Unit unit = Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.common.remoteimage.CoinRemoteImage$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0640StateListAnimator extends AbstractC5449Sd<Drawable> {
            public final /* synthetic */ TabLayout.Tab OLrzqt;
            public final /* synthetic */ CoinRemoteImage copydefault;

            @Override // o.InterfaceC5462Sq
            public void a_(Drawable drawable) {
            }

            public C0640StateListAnimator(CoinRemoteImage coinRemoteImage, TabLayout.Tab tab) {
                this.copydefault = coinRemoteImage;
                this.OLrzqt = tab;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
            @Override // o.InterfaceC5462Sq
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public void copydefault(Drawable drawable, InterfaceC5460So<? super Drawable> interfaceC5460So) {
                Intrinsics.checkNotNullParameter(drawable, "");
                CoinRemoteImage.cache.put(this.copydefault.name(), drawable);
                StateListAnimator.OLrzqt(this.OLrzqt, drawable);
            }
        }
    }

    public final String getUrl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C43454rpb.copydefault(BOT_PREFIX + this.url, context, this.isDarkSupported);
    }

    public static CoinRemoteImage valueOf(String str) {
        return (CoinRemoteImage) Enum.valueOf(CoinRemoteImage.class, str);
    }

    public static CoinRemoteImage[] values() {
        return (CoinRemoteImage[]) $VALUES.clone();
    }
}
