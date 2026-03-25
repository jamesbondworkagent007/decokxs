package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.dexkline.market.data.model.MarketBuySellKLinePoint;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mQW extends mQV {
    public final java.lang.String AEQbTJ;
    public AbstractC57556yke AYXKKw;
    public InterfaceC58217yxC EZpvd;
    public final java.lang.String KWHzl;
    public final LinkedBlockingDeque<java.lang.String> OLrzqt;
    public final WeakReference<InterfaceC32154mRm> copydefault;
    public final java.lang.String djBIcL;

    public mQW(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull WeakReference<InterfaceC32154mRm> weakReference) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.KWHzl = str;
        this.djBIcL = str2;
        this.copydefault = weakReference;
        this.OLrzqt = new LinkedBlockingDeque<>();
        this.AEQbTJ = "dex-market-kline-bs";
    }

    public static /* synthetic */ void initKlineBuySellPointerAndWsListener$default(mQW mqw, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        mqw.copydefault(str, str2, str3);
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        EZpvd();
        AbstractC58185ywX<java.util.List<MarketBuySellKLinePoint>> abstractC58185ywXAEQbTJ = mPY.OLrzqt.copydefault("default_trade").KWHzl().AEQbTJ(str, this.KWHzl, this.djBIcL, str2, 1000, str3);
        final Function1 function1 = new Function1() { // from class: o.mQX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mQW.OLrzqt(this.copydefault, str, str2, str3, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<MarketBuySellKLinePoint>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mRa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mQW.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.mQZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mQW.copydefault((java.lang.Throwable) obj);
            }
        };
        this.EZpvd = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mQW.AhwBna(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(mQW mqw, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        InterfaceC32154mRm interfaceC32154mRm = mqw.copydefault.get();
        if (interfaceC32154mRm != null) {
            Intrinsics.copydefault(list);
            interfaceC32154mRm.AEQbTJ(list);
        }
        mqw.KWHzl(str, str2, str3);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = this.AEQbTJ;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("chainId", this.KWHzl);
        jsonObject.addProperty("tokenAddress", this.djBIcL);
        jsonObject.addProperty("bar", str);
        if (str3.length() > 0) {
            jsonObject.addProperty("fromAddressTag", str3);
        } else {
            jsonObject.addProperty("fromAddress", str2);
        }
        Unit unit = Unit.INSTANCE;
        AbstractC57556yke abstractC57556ykeAEQbTJ = AEQbTJ(this.AEQbTJ, new WsArgV5ForWeb3(str4, null, null, null, jsonObject, 14, null));
        this.AYXKKw = abstractC57556ykeAEQbTJ;
        abstractC57556ykeAEQbTJ.AhwBna();
        AEQbTJ(200L);
    }

    public void EZpvd() {
        this.OLrzqt.clear();
        InterfaceC58217yxC interfaceC58217yxCAhwBna = AhwBna();
        if (interfaceC58217yxCAhwBna != null) {
            interfaceC58217yxCAhwBna.dispose();
        }
        AbstractC57556yke abstractC57556yke = this.AYXKKw;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
            C32152mRk.Companion.EZpvd(this.AEQbTJ, abstractC57556yke);
            this.AYXKKw = null;
        }
    }

    @Override // o.mQP
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(true);
        this.OLrzqt.put(str);
    }

    @Override // o.mQP
    public void copydefault() {
        OLrzqt();
    }

    public final void AEQbTJ() {
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        EZpvd();
    }

    private final void OLrzqt() {
        synchronized (this) {
            for (java.lang.String str : this.OLrzqt) {
                try {
                    InterfaceC32154mRm interfaceC32154mRm = this.copydefault.get();
                    if (interfaceC32154mRm != null) {
                        java.lang.Object objFromJson = new Gson().fromJson(str, (java.lang.Class<java.lang.Object>) MarketBuySellKLinePoint.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                        interfaceC32154mRm.KWHzl((MarketBuySellKLinePoint) objFromJson);
                    }
                } catch (java.lang.Exception e) {
                    e.getMessage();
                }
            }
        }
    }
}
