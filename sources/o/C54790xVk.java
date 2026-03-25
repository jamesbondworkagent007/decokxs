package o;

import androidx.camera.video.AudioStats;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.biz.subscribe.DepthItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54790xVk {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.xVk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xVk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String AEQbTJ(@NotNull BizInstrument bizInstrument) {
            xOW newProxyInstance;
            MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
            ValuationCurrencyData value;
            Intrinsics.checkNotNullParameter(bizInstrument, "");
            java.lang.String instId = bizInstrument.getInstId();
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            return instId + "_" + ((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null) ? null : value.getIsoCode()) + "_ladder";
        }

        public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            BizInstrument suggestedInstrument$default;
            AbstractC54531xLw abstractC54531xLwOLrzqt;
            java.lang.String str3 = "";
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) == null) {
                return "";
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            java.util.List<java.lang.String> listKWHzl = (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(suggestedInstrument$default.getInstType())) == null) ? null : abstractC54531xLwOLrzqt.KWHzl(suggestedInstrument$default);
            if (listKWHzl != null && (!listKWHzl.isEmpty())) {
                str3 = listKWHzl.get(0);
            }
            java.lang.String string = SPUtils.getString(AEQbTJ(suggestedInstrument$default), str3);
            if (listKWHzl == null || !listKWHzl.contains(string)) {
                return str3;
            }
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }

        public final java.util.ArrayList<C54429xIb> OLrzqt(java.util.ArrayList<DepthItem> arrayList, double d, int i, double d2, boolean z) {
            double dEZpvd;
            C54429xIb c54429xIbOLrzqt;
            if (arrayList == null || arrayList.size() == 0) {
                return new java.util.ArrayList<>();
            }
            if (d == AudioStats.AUDIO_AMPLITUDE_NONE) {
                return new java.util.ArrayList<>();
            }
            java.util.ArrayList<C54429xIb> arrayList2 = new java.util.ArrayList<>();
            C54429xIb c54429xIb = new C54429xIb();
            int size = arrayList.size() - 1;
            double d3 = 0.0d;
            while (-1 < size) {
                DepthItem depthItem = arrayList.get(size);
                Intrinsics.checkNotNullExpressionValue(depthItem, "");
                DepthItem depthItem2 = depthItem;
                double d4 = d3;
                double dEZpvd2 = C33471mxA.EZpvd(C33129mqd.AEQbTJ(arrayList.get(size).getPrice()), d2);
                if (dEZpvd2 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    break;
                }
                if (d4 - d < dEZpvd2 && dEZpvd2 <= d4 && z) {
                    c54429xIb.KWHzl(C33471mxA.KWHzl(C33129mqd.AEQbTJ(java.lang.Double.valueOf(c54429xIb.AEQbTJ())), C33129mqd.AEQbTJ(depthItem2.getAmount())));
                    c54429xIbOLrzqt = c54429xIb;
                    dEZpvd = d4;
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
                    dEZpvd = C33471mxA.EZpvd(C33471mxA.KWHzl(C33471mxA.copydefault(dEZpvd2, d, 1), 0), d);
                    if (dEZpvd == AudioStats.AUDIO_AMPLITUDE_NONE) {
                        break;
                    }
                    c54429xIbOLrzqt = OLrzqt(dEZpvd, C33129mqd.AEQbTJ(depthItem2.getAmount()));
                    arrayList2.add(c54429xIbOLrzqt);
                }
                size--;
                c54429xIb = c54429xIbOLrzqt;
                d3 = dEZpvd;
            }
            if (c54429xIb.copydefault() == AudioStats.AUDIO_AMPLITUDE_NONE || c54429xIb.AEQbTJ() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                arrayList2.remove(c54429xIb);
            }
            return arrayList2;
        }

        public final java.util.ArrayList<C54429xIb> EZpvd(java.util.ArrayList<DepthItem> arrayList, double d, int i, double d2, boolean z) {
            int i2;
            if (arrayList == null || arrayList.size() == 0) {
                return new java.util.ArrayList<>();
            }
            if (d == AudioStats.AUDIO_AMPLITUDE_NONE) {
                return new java.util.ArrayList<>();
            }
            java.util.ArrayList<C54429xIb> arrayList2 = new java.util.ArrayList<>();
            C54429xIb c54429xIb = new C54429xIb();
            int size = arrayList.size();
            double dEZpvd = 0.0d;
            int i3 = 0;
            while (i3 < size) {
                DepthItem depthItem = arrayList.get(i3);
                Intrinsics.checkNotNullExpressionValue(depthItem, "");
                DepthItem depthItem2 = depthItem;
                double dEZpvd2 = C33471mxA.EZpvd(C33129mqd.AEQbTJ(arrayList.get(i3).getPrice()), d2);
                if (dEZpvd <= dEZpvd2 && dEZpvd2 < dEZpvd + d && z) {
                    i2 = i3;
                    c54429xIb.KWHzl(C33471mxA.KWHzl(C33129mqd.AEQbTJ(java.lang.Double.valueOf(c54429xIb.AEQbTJ())), C33129mqd.AEQbTJ(depthItem2.getAmount())));
                } else {
                    i2 = i3;
                    if (arrayList2.size() > 0) {
                        C54429xIb c54429xIb2 = arrayList2.get(0);
                        Intrinsics.checkNotNullExpressionValue(c54429xIb2, "");
                        C54429xIb c54429xIb3 = c54429xIb2;
                        if (c54429xIb3.AEQbTJ() == AudioStats.AUDIO_AMPLITUDE_NONE || c54429xIb.copydefault() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                            arrayList2.remove(c54429xIb3);
                        }
                    }
                    if (arrayList2.size() >= i) {
                        break;
                    }
                    dEZpvd = C33471mxA.EZpvd(C33471mxA.AEQbTJ(C33471mxA.KWHzl(dEZpvd2, d, 1), 0), d);
                    if (dEZpvd == AudioStats.AUDIO_AMPLITUDE_NONE) {
                        break;
                    }
                    c54429xIb = OLrzqt(dEZpvd, C33129mqd.AEQbTJ(depthItem2.getAmount()));
                    arrayList2.add(0, c54429xIb);
                }
                i3 = i2 + 1;
            }
            if (c54429xIb.copydefault() == AudioStats.AUDIO_AMPLITUDE_NONE || c54429xIb.AEQbTJ() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                arrayList2.remove(c54429xIb);
            }
            C56404yEc.zsXlph(arrayList2);
            return arrayList2;
        }

        public final C54429xIb OLrzqt(double d, double d2) {
            C54429xIb c54429xIb = new C54429xIb();
            c54429xIb.EZpvd(d);
            c54429xIb.KWHzl(d2);
            return c54429xIb;
        }

        public static /* synthetic */ int getDepthAmtDigit$default(Application application, java.lang.Double d, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return application.AEQbTJ(d, str, str2);
        }

        public final int AEQbTJ(java.lang.Double d, java.lang.String str, java.lang.String str2) {
            BizInstrument suggestedInstrument$default;
            AbstractC54531xLw abstractC54531xLwOLrzqt;
            int iHashCode;
            java.lang.String sheetDig;
            java.lang.String instFamily;
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            java.lang.String str3 = "";
            if (interfaceC54581xNrOLrzqt != null) {
                suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str == null ? "" : str, str2, null, null, 12, null);
            } else {
                suggestedInstrument$default = null;
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null) {
                abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(str == null ? "" : str);
            } else {
                abstractC54531xLwOLrzqt = null;
            }
            if (str != null && ((iHashCode = str.hashCode()) == -1956807563 ? str.equals("OPTION") : !(iHashCode == 2558355 ? !str.equals("SWAP") : !(iHashCode == 214415088 && str.equals("FUTURES"))))) {
                java.lang.String strGEmmrt = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.gEmmrt(suggestedInstrument$default) : null;
                if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "2")) {
                    java.lang.String str4 = "0";
                    if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "0")) {
                        if (abstractC54531xLwOLrzqt != null) {
                            if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
                                str3 = instFamily;
                            }
                            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(str3);
                            if (idxConfigAkhnZx != null && (sheetDig = idxConfigAkhnZx.getSheetDig()) != null) {
                                str4 = sheetDig;
                            }
                        }
                        return C33129mqd.AhwBna(str4);
                    }
                }
                if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "OPTION") && Intrinsics.EZpvd((java.lang.Object) abstractC54531xLwOLrzqt.copydefault(suggestedInstrument$default), (java.lang.Object) "linear")) {
                    return 2;
                }
            } else if (C33129mqd.AhwBna(d, 0) && C33129mqd.gEmmrt(d, 1000)) {
                return java.lang.Integer.max(2, java.lang.Integer.max(2, xMR.copydefault.OLrzqt((java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getMinSize() : null)).scale()));
            }
            return 3;
        }

        public static /* synthetic */ java.lang.String limitFmtAmount$default(Application application, double d, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 3;
            }
            return application.OLrzqt(d, i);
        }

        public final java.lang.String OLrzqt(double d, int i) {
            if (d < 10.0d) {
                xMR xmr = xMR.copydefault;
                java.lang.String downToFixed$default = pTB.formatDownToFixed$default(xmr.OLrzqt(java.lang.Double.valueOf(d)), i, null, 2, null);
                return C33129mqd.OLrzqt(downToFixed$default, "0") ? pTB.formatUpToFixed$default(xmr.OLrzqt(java.lang.Double.valueOf(d)), i, null, 2, null) : downToFixed$default;
            }
            if (d < 1000.0d) {
                return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt(java.lang.Double.valueOf(d)), i, null, 2, null);
            }
            if (d < 1000000.0d) {
                return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt(java.lang.Double.valueOf(d / 1000.0d)), 2, null, 2, null) + "K";
            }
            if (d < 1.0E9d) {
                return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt(java.lang.Double.valueOf(d / 1000000.0d)), 2, null, 2, null) + "M";
            }
            if (d < 1.0E12d) {
                return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt(java.lang.Double.valueOf(d / 1.0E9d)), 2, null, 2, null) + "B";
            }
            return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt(java.lang.Double.valueOf(d / 1.0E12d)), 2, null, 2, null) + ExifInterface.GPS_DIRECTION_TRUE;
        }
    }
}
