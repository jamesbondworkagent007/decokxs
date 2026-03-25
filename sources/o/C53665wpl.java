package o;

import com.okinc.tradingbot.impl.planet.dto.BotDirection;
import com.okinc.tradingbot.impl.planet.model.BotTag;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.C55770xqH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53665wpl extends vNA<C53598woX, java.util.List<? extends BotTag>> {

    /* JADX INFO: renamed from: o.wpl$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BotDirection.values().length];
            try {
                iArr[BotDirection.Long.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BotDirection.Short.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BotDirection.Neutral.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public C53665wpl() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [32=9] */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.vNA
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.util.List<BotTag> KWHzl(@NotNull C53598woX c53598woX) {
        Intrinsics.checkNotNullParameter(c53598woX, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strAEQbTJ = c53598woX.AEQbTJ();
        switch (strAEQbTJ.hashCode()) {
            case -1831183611:
                if (strAEQbTJ.equals("spot_dca")) {
                    arrayList.add(new BotTag(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatCallbackStubApi23), 0, 0, 6, null));
                }
                return arrayList;
            case -1402017003:
                if (strAEQbTJ.equals("contract_dca")) {
                    arrayList.add(new BotTag(C33070mpX.AYXKKw(C55688xof.Application.QSAYLr), 0, 0, 6, null));
                    arrayList.add(new BotTag(C33070mpX.AYXKKw(C55688xof.Application.onSeekTo), 0, 0, 6, null));
                    EZpvd(arrayList, c53598woX.copydefault());
                    KWHzl(arrayList, c53598woX.EZpvd());
                }
                return arrayList;
            case -1216369070:
                if (strAEQbTJ.equals("smart_portfolio")) {
                    arrayList.add(new BotTag(C33070mpX.AYXKKw(C55688xof.Application.FractionRes), 0, 0, 6, null));
                }
                return arrayList;
            case -1086683216:
                if (strAEQbTJ.equals("signal_bot")) {
                    arrayList.add(new BotTag(C33070mpX.AYXKKw(C55688xof.Application.fdazkH), 0, 0, 6, null));
                    EZpvd(arrayList, c53598woX.copydefault());
                }
                return arrayList;
            case -557961837:
                if (strAEQbTJ.equals("smart_arbitrage")) {
                    arrayList.add(new BotTag(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21), 0, 0, 6, null));
                    java.lang.String strCopydefault = c53598woX.copydefault();
                    if (strCopydefault != null) {
                        java.lang.Float fEZpvd = C55770xqH.Activity.copydefault.EZpvd(java.lang.Float.valueOf(C33129mqd.djBIcL(strCopydefault)));
                        if (fEZpvd != null) {
                            arrayList.add(new BotTag(C56033xvF.formatLeverPrincipal$default(java.lang.Float.valueOf(fEZpvd.floatValue()), null, 2, null), 0, 0, 6, null));
                        }
                    }
                }
                return arrayList;
            case -512749997:
                if (strAEQbTJ.equals("contract_grid")) {
                    arrayList.add(new BotTag(C33070mpX.AYXKKw(C55688xof.Application.QSAYLr), 0, 0, 6, null));
                    arrayList.add(new BotTag(C33070mpX.AYXKKw(C55688xof.Application.onContextAvailable), 0, 0, 6, null));
                    EZpvd(arrayList, c53598woX.copydefault());
                    KWHzl(arrayList, c53598woX.EZpvd());
                }
                return arrayList;
            case 3181382:
                if (strAEQbTJ.equals("grid")) {
                    arrayList.add(new BotTag(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivity22), 0, 0, 6, null));
                }
                return arrayList;
            case 1165749981:
                if (strAEQbTJ.equals("recurring")) {
                    arrayList.add(new BotTag(C33070mpX.AYXKKw(C55688xof.Application.setSessionImpl), 0, 0, 6, null));
                }
                return arrayList;
            case 1485620813:
                if (strAEQbTJ.equals("dcd_bot")) {
                    arrayList.add(new BotTag(C33070mpX.AYXKKw(C55688xof.Application.setCurrentKeyboardTarget), 0, 0, 6, null));
                }
                return arrayList;
            default:
                return arrayList;
        }
    }

    public final void EZpvd(java.util.List<BotTag> list, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        list.add(new BotTag(C56033xvF.getBotLever$default(str, false, 2, null), 0, 0, 6, null));
    }

    public final void KWHzl(java.util.List<BotTag> list, BotDirection botDirection) {
        int i;
        if (botDirection == null) {
            return;
        }
        java.lang.String strAhwBna = C56033xvF.AhwBna(botDirection.toString());
        int i2 = TaskDescription.copydefault[botDirection.ordinal()];
        if (i2 == 1) {
            i = 14;
        } else if (i2 == 2) {
            i = 13;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 6;
        }
        list.add(new BotTag(strAhwBna, i, 0, 4, null));
    }
}
