package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.MutableLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.biz.subscribe.BizDepthData;
import com.okinc.unify_trade.biz.subscribe.DepthItem;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C54790xVk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54079wxb implements InterfaceC54501xKt<BizDepthData, C54780xVa> {
    public static final int AEQbTJ = BizInstrument.$stable;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final BizInstrument copydefault;

    public C54079wxb(@NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = bizInstrument;
        this.KWHzl = str;
        this.EZpvd = i;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    @Override // o.InterfaceC54501xKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C54780xVa KWHzl(@NotNull BizDepthData bizDepthData) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        java.lang.String usdToThisRate;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(bizDepthData, "");
        C54780xVa c54780xVa = new C54780xVa(this.copydefault.getInstId(), this.copydefault.getInstType());
        if (this.copydefault.getInstId().length() > 0) {
            if (Intrinsics.EZpvd((java.lang.Object) this.copydefault.getInstType(), (java.lang.Object) "OPTION")) {
                BizInstrument bizInstrument = this.copydefault;
                java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) bizDepthData.getAsks());
                C56404yEc.zsXlph(listFJNWhG);
                Unit unit = Unit.INSTANCE;
                c54780xVa.OLrzqt(KWHzl(bizInstrument, (java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(listFJNWhG, new java.util.ArrayList()), C33129mqd.AEQbTJ(this.KWHzl), this.EZpvd));
                c54780xVa.AEQbTJ(OLrzqt(this.copydefault, bizDepthData.getBids(), C33129mqd.AEQbTJ(this.KWHzl), this.EZpvd));
            } else {
                java.lang.String instType = this.copydefault.getInstType();
                if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "SWAP")) {
                    C54589xNz c54589xNz = C54589xNz.EZpvd;
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                    double dAEQbTJ = (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(this.copydefault.getInstType())) == null) ? null : abstractC54531xLwOLrzqt.copydefault(this.copydefault)), (java.lang.Object) "linear") || (interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null || (usdToThisRate = value.getUsdToThisRate()) == null) ? 1.0d : C33129mqd.AEQbTJ(usdToThisRate);
                    boolean z = this.copydefault instanceof SpotInstrument ? !Intrinsics.EZpvd((java.lang.Object) ((SpotInstrument) r3).getContinuous(), (java.lang.Object) "1") : true;
                    C54790xVk.Application application = C54790xVk.Companion;
                    java.util.List listFJNWhG2 = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) bizDepthData.getAsks());
                    C56404yEc.zsXlph(listFJNWhG2);
                    Unit unit2 = Unit.INSTANCE;
                    double d = dAEQbTJ;
                    boolean z2 = z;
                    c54780xVa.OLrzqt(application.OLrzqt((java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(listFJNWhG2, new java.util.ArrayList()), C33129mqd.AEQbTJ(this.KWHzl), this.EZpvd, d, z2));
                    c54780xVa.AEQbTJ(application.EZpvd(bizDepthData.getBids(), C33129mqd.AEQbTJ(this.KWHzl), this.EZpvd, d, z2));
                }
            }
        }
        c54780xVa.KWHzl(this.KWHzl);
        return c54780xVa;
    }

    public final java.util.ArrayList<C54429xIb> KWHzl(BizInstrument bizInstrument, java.util.ArrayList<DepthItem> arrayList, double d, int i) {
        java.lang.String instFamily;
        java.lang.String price;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMS xmsGEmmrt;
        if (arrayList == null || arrayList.size() == 0) {
            return new java.util.ArrayList<>();
        }
        double d2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (d == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return new java.util.ArrayList<>();
        }
        java.util.ArrayList<C54429xIb> arrayList2 = new java.util.ArrayList<>();
        C54429xIb c54429xIb = new C54429xIb();
        if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
            instFamily = "";
        }
        int size = arrayList.size() - 1;
        double dEZpvd = 0.0d;
        while (-1 < size) {
            DepthItem depthItem = arrayList.get(size);
            Intrinsics.checkNotNullExpressionValue(depthItem, "");
            DepthItem depthItem2 = depthItem;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("OPTION")) == null || (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily)) == null || (price = xmsGEmmrt.AhwBna(depthItem2.getPrice())) == null) {
                price = depthItem2.getPrice();
            }
            double dAEQbTJ = C33129mqd.AEQbTJ(price);
            if (dAEQbTJ == d2) {
                break;
            }
            if (dEZpvd - d < dAEQbTJ && dAEQbTJ <= dEZpvd) {
                c54429xIb.KWHzl(C33471mxA.KWHzl(C33129mqd.AEQbTJ(java.lang.Double.valueOf(c54429xIb.AEQbTJ())), C33129mqd.AEQbTJ(depthItem2.getAmount())));
            } else {
                if (arrayList2.size() > 0) {
                    C54429xIb c54429xIb2 = arrayList2.get(arrayList2.size() - 1);
                    Intrinsics.checkNotNullExpressionValue(c54429xIb2, "");
                    C54429xIb c54429xIb3 = c54429xIb2;
                    if (c54429xIb3.AEQbTJ() == AudioStats.AUDIO_AMPLITUDE_NONE || c54429xIb.copydefault() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                        arrayList2.remove(c54429xIb3);
                    }
                }
                if (arrayList2.size() >= i) {
                    break;
                }
                dEZpvd = C33471mxA.EZpvd(C33471mxA.KWHzl(C33471mxA.copydefault(dAEQbTJ, d, 1), 0), d);
                C33129mqd.divD$default(java.lang.Double.valueOf(dAEQbTJ), java.lang.Double.valueOf(d), null, null, RoundingMode.DOWN, 6, null);
                if (dEZpvd == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    break;
                }
                C54429xIb c54429xIbOLrzqt = C54790xVk.Companion.OLrzqt(dEZpvd, C33129mqd.AEQbTJ(depthItem2.getAmount()));
                arrayList2.add(c54429xIbOLrzqt);
                c54429xIb = c54429xIbOLrzqt;
            }
            size--;
            d2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        if (c54429xIb.copydefault() == AudioStats.AUDIO_AMPLITUDE_NONE || c54429xIb.AEQbTJ() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            arrayList2.remove(c54429xIb);
        }
        return arrayList2;
    }

    public final java.util.ArrayList<C54429xIb> OLrzqt(BizInstrument bizInstrument, java.util.ArrayList<DepthItem> arrayList, double d, int i) {
        java.lang.String instFamily;
        java.lang.String price;
        int i2;
        xMS xmsGEmmrt;
        java.util.ArrayList<DepthItem> arrayList2 = arrayList;
        double d2 = d;
        if (arrayList2 == null || arrayList.size() == 0) {
            return new java.util.ArrayList<>();
        }
        if (d2 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return new java.util.ArrayList<>();
        }
        java.util.ArrayList<C54429xIb> arrayList3 = new java.util.ArrayList<>();
        C54429xIb c54429xIb = new C54429xIb();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("OPTION") : null;
        if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
            instFamily = "";
        }
        int size = arrayList.size();
        double dEZpvd = 0.0d;
        int i3 = 0;
        while (i3 < size) {
            DepthItem depthItem = arrayList2.get(i3);
            Intrinsics.checkNotNullExpressionValue(depthItem, "");
            DepthItem depthItem2 = depthItem;
            if (abstractC54531xLwOLrzqt == null || (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily)) == null || (price = xmsGEmmrt.AhwBna(depthItem2.getPrice())) == null) {
                price = depthItem2.getPrice();
            }
            double dAEQbTJ = C33129mqd.AEQbTJ(price);
            if (dEZpvd - d2 < dAEQbTJ && dAEQbTJ <= dEZpvd) {
                i2 = i3;
                c54429xIb.KWHzl(C33471mxA.KWHzl(C33129mqd.AEQbTJ(java.lang.Double.valueOf(c54429xIb.AEQbTJ())), C33129mqd.AEQbTJ(depthItem2.getAmount())));
            } else {
                i2 = i3;
                if (arrayList3.size() > 0) {
                    C54429xIb c54429xIb2 = arrayList3.get(0);
                    Intrinsics.checkNotNullExpressionValue(c54429xIb2, "");
                    C54429xIb c54429xIb3 = c54429xIb2;
                    if (c54429xIb3.AEQbTJ() == AudioStats.AUDIO_AMPLITUDE_NONE || c54429xIb.copydefault() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                        arrayList3.remove(c54429xIb3);
                    }
                }
                if (arrayList3.size() >= i) {
                    break;
                }
                dEZpvd = C33471mxA.EZpvd(C33471mxA.AEQbTJ(C33471mxA.KWHzl(dAEQbTJ, d2, 1), 0), d2);
                if (dEZpvd == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    break;
                }
                C54429xIb c54429xIbOLrzqt = C54790xVk.Companion.OLrzqt(dEZpvd, C33129mqd.AEQbTJ(depthItem2.getAmount()));
                arrayList3.add(0, c54429xIbOLrzqt);
                c54429xIb = c54429xIbOLrzqt;
            }
            d2 = d;
            i3 = i2 + 1;
            arrayList2 = arrayList;
        }
        if (c54429xIb.copydefault() == AudioStats.AUDIO_AMPLITUDE_NONE || c54429xIb.AEQbTJ() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            arrayList3.remove(c54429xIb);
        }
        C56404yEc.zsXlph(arrayList3);
        return arrayList3;
    }
}
