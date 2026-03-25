package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.market.data.model.MarketBuySellKLinePoint;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23184htT extends AbstractC23180htP {
    public final LinkedBlockingDeque<java.lang.String> AEQbTJ;
    public AbstractC57556yke AYXKKw;
    public final java.lang.String EZpvd;
    public InterfaceC58217yxC KWHzl;
    public final java.lang.String OLrzqt;
    public final WeakReference<InterfaceC23253huj> copydefault;
    public final java.lang.String djBIcL;

    public C23184htT(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull WeakReference<InterfaceC23253huj> weakReference) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.EZpvd = str;
        this.djBIcL = str2;
        this.copydefault = weakReference;
        this.AEQbTJ = new LinkedBlockingDeque<>();
        this.OLrzqt = "dex-market-kline-bs";
    }

    public static /* synthetic */ void initKlineBuySellPointerAndWsListener$default(C23184htT c23184htT, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        c23184htT.AEQbTJ(str, str2, str3);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (C22416heu.ejfBZ()) {
            return;
        }
        AEQbTJ();
        AbstractC58185ywX<java.util.List<MarketBuySellKLinePoint>> abstractC58185ywXOLrzqt = C22380heK.OLrzqt.copydefault("default_trade").isConnected().OLrzqt(str, this.EZpvd, this.djBIcL, str2, 1000, str3);
        final Function1 function1 = new Function1() { // from class: o.htV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23184htT.OLrzqt(this.AEQbTJ, str, str2, str3, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<MarketBuySellKLinePoint>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.htU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23184htT.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.htX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23184htT.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        this.KWHzl = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.htZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23184htT.djBIcL(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C23184htT c23184htT, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        InterfaceC23253huj interfaceC23253huj = c23184htT.copydefault.get();
        if (interfaceC23253huj != null) {
            Intrinsics.copydefault(list);
            interfaceC23253huj.copydefault(list);
        }
        c23184htT.KWHzl(str, str2, str3);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C23184htT c23184htT, java.lang.Throwable th) {
        InterfaceC23253huj interfaceC23253huj = c23184htT.copydefault.get();
        if (interfaceC23253huj != null) {
            interfaceC23253huj.copydefault(yDY.AhwBna());
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = this.OLrzqt;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("chainId", this.EZpvd);
        jsonObject.addProperty("tokenAddress", this.djBIcL);
        jsonObject.addProperty("bar", str);
        if (str3.length() > 0) {
            jsonObject.addProperty("fromAddressTag", str3);
        } else {
            jsonObject.addProperty("fromAddress", str2);
        }
        Unit unit = Unit.INSTANCE;
        AbstractC57556yke abstractC57556ykeEZpvd = EZpvd(this.OLrzqt, new WsArgV5ForWeb3(str4, null, null, null, jsonObject, 14, null));
        this.AYXKKw = abstractC57556ykeEZpvd;
        abstractC57556ykeEZpvd.AhwBna();
        AEQbTJ(200L);
    }

    public void AEQbTJ() {
        this.AEQbTJ.clear();
        InterfaceC58217yxC interfaceC58217yxCValueOf = valueOf();
        if (interfaceC58217yxCValueOf != null) {
            interfaceC58217yxCValueOf.dispose();
        }
        AbstractC57556yke abstractC57556yke = this.AYXKKw;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
            C23252hui.Companion.KWHzl(this.OLrzqt, abstractC57556yke);
            this.AYXKKw = null;
        }
    }

    @Override // o.InterfaceC23182htR
    public void copydefault(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(true);
        this.AEQbTJ.put(str);
    }

    @Override // o.InterfaceC23182htR
    public void copydefault() {
        OLrzqt();
    }

    public final void EZpvd() {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AEQbTJ();
    }

    private final void OLrzqt() {
        synchronized (this) {
            for (java.lang.String str : this.AEQbTJ) {
                try {
                    InterfaceC23253huj interfaceC23253huj = this.copydefault.get();
                    if (interfaceC23253huj != null) {
                        java.lang.Object objFromJson = new Gson().fromJson(str, (java.lang.Class<java.lang.Object>) MarketBuySellKLinePoint.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                        interfaceC23253huj.KWHzl((MarketBuySellKLinePoint) objFromJson);
                    }
                } catch (java.lang.Exception e) {
                    e.getMessage();
                }
            }
        }
    }
}
