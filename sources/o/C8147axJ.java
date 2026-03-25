package o;

import com.contrarywind.listener.OnItemSelectedListener;
import com.contrarywind.view.WheelView;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.MW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.axJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8147axJ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public int AEQbTJ;
    public boolean AYXKKw;
    public int AhwBna;
    public final android.view.View AkhnZx;
    public WheelView AuCTel;
    public int DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public int copydefault;
    public final int djBIcL;
    public WheelView ejfBZ;
    public WheelView fARcdN;
    public WheelView fIwbmz;
    public WheelView fJNWhG;
    public final int fetchVPNInfo;
    public InterfaceC5317Nb gEmmrt;
    public WheelView hDKMBd;
    public final TimeZone isConnected;
    public int valueOf;
    public final boolean[] values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InterfaceC5317Nb interfaceC5317Nb) {
        this.gEmmrt = interfaceC5317Nb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.DbNXlk = i;
    }

    public C8147axJ(@NotNull android.view.View view, @NotNull boolean[] zArr, int i, int i2, @NotNull TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(zArr, "");
        Intrinsics.checkNotNullParameter(timeZone, "");
        this.AkhnZx = view;
        this.values = zArr;
        this.djBIcL = i;
        this.fetchVPNInfo = i2;
        this.isConnected = timeZone;
        this.DbNXlk = 1900;
        this.AEQbTJ = 2100;
        this.AhwBna = 1;
        this.KWHzl = 12;
        this.valueOf = 1;
        this.copydefault = 31;
    }

    public final void AEQbTJ(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.AYXKKw) {
            int[] iArrCopydefault = C5322Ng.copydefault(i, i2 + 1, i3);
            EZpvd(iArrCopydefault[0], iArrCopydefault[1] - 1, iArrCopydefault[2], iArrCopydefault[3] == 1, i4, i5);
            return;
        }
        EZpvd(i, i2, i3, i4, i5, i6);
    }

    public final void EZpvd(int i, int i2, int i3, boolean z, int i4, int i5) {
        android.view.View viewFindViewById = this.AkhnZx.findViewById(MW.Activity.isConnected);
        Intrinsics.copydefault(viewFindViewById, "");
        WheelView wheelView = (WheelView) viewFindViewById;
        this.hDKMBd = wheelView;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setAdapter(new MT(C5320Ne.KWHzl(this.DbNXlk, this.AEQbTJ)));
        WheelView wheelView3 = this.hDKMBd;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setLabel("");
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setCurrentItem(i - this.DbNXlk);
        WheelView wheelView5 = this.hDKMBd;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setGravity(this.djBIcL);
        android.view.View viewFindViewById2 = this.AkhnZx.findViewById(MW.Activity.gEmmrt);
        Intrinsics.copydefault(viewFindViewById2, "");
        WheelView wheelView6 = (WheelView) viewFindViewById2;
        this.AuCTel = wheelView6;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setAdapter(new MT(C5320Ne.KWHzl(i)));
        WheelView wheelView7 = this.AuCTel;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
            wheelView7 = null;
        }
        wheelView7.setLabel("");
        int iAYXKKw = C5320Ne.AYXKKw(i);
        if (iAYXKKw == 0 || (i2 <= iAYXKKw - 1 && !z)) {
            WheelView wheelView8 = this.AuCTel;
            if (wheelView8 == null) {
                Intrinsics.gEmmrt("");
                wheelView8 = null;
            }
            wheelView8.setCurrentItem(i2);
        } else {
            WheelView wheelView9 = this.AuCTel;
            if (wheelView9 == null) {
                Intrinsics.gEmmrt("");
                wheelView9 = null;
            }
            wheelView9.setCurrentItem(i2 + 1);
        }
        WheelView wheelView10 = this.AuCTel;
        if (wheelView10 == null) {
            Intrinsics.gEmmrt("");
            wheelView10 = null;
        }
        wheelView10.setGravity(this.djBIcL);
        android.view.View viewFindViewById3 = this.AkhnZx.findViewById(MW.Activity.OLrzqt);
        Intrinsics.copydefault(viewFindViewById3, "");
        this.fIwbmz = (WheelView) viewFindViewById3;
        if (C5320Ne.AYXKKw(i) == 0) {
            WheelView wheelView11 = this.fIwbmz;
            if (wheelView11 == null) {
                Intrinsics.gEmmrt("");
                wheelView11 = null;
            }
            wheelView11.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(i, i2))));
        } else {
            WheelView wheelView12 = this.fIwbmz;
            if (wheelView12 == null) {
                Intrinsics.gEmmrt("");
                wheelView12 = null;
            }
            wheelView12.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(i))));
        }
        WheelView wheelView13 = this.fIwbmz;
        if (wheelView13 == null) {
            Intrinsics.gEmmrt("");
            wheelView13 = null;
        }
        wheelView13.setLabel("");
        WheelView wheelView14 = this.fIwbmz;
        if (wheelView14 == null) {
            Intrinsics.gEmmrt("");
            wheelView14 = null;
        }
        wheelView14.setCurrentItem(i3 - 1);
        WheelView wheelView15 = this.fIwbmz;
        if (wheelView15 == null) {
            Intrinsics.gEmmrt("");
            wheelView15 = null;
        }
        wheelView15.setGravity(this.djBIcL);
        android.view.View viewFindViewById4 = this.AkhnZx.findViewById(MW.Activity.KWHzl);
        Intrinsics.copydefault(viewFindViewById4, "");
        WheelView wheelView16 = (WheelView) viewFindViewById4;
        this.fJNWhG = wheelView16;
        if (wheelView16 == null) {
            Intrinsics.gEmmrt("");
            wheelView16 = null;
        }
        wheelView16.setAdapter(new MU(0, 23));
        WheelView wheelView17 = this.fJNWhG;
        if (wheelView17 == null) {
            Intrinsics.gEmmrt("");
            wheelView17 = null;
        }
        wheelView17.setCurrentItem(i4);
        WheelView wheelView18 = this.fJNWhG;
        if (wheelView18 == null) {
            Intrinsics.gEmmrt("");
            wheelView18 = null;
        }
        wheelView18.setGravity(this.djBIcL);
        android.view.View viewFindViewById5 = this.AkhnZx.findViewById(MW.Activity.valueOf);
        Intrinsics.copydefault(viewFindViewById5, "");
        WheelView wheelView19 = (WheelView) viewFindViewById5;
        this.fARcdN = wheelView19;
        if (wheelView19 == null) {
            Intrinsics.gEmmrt("");
            wheelView19 = null;
        }
        wheelView19.setAdapter(new MU(0, 59));
        WheelView wheelView20 = this.fARcdN;
        if (wheelView20 == null) {
            Intrinsics.gEmmrt("");
            wheelView20 = null;
        }
        wheelView20.setCurrentItem(i5);
        WheelView wheelView21 = this.fARcdN;
        if (wheelView21 == null) {
            Intrinsics.gEmmrt("");
            wheelView21 = null;
        }
        wheelView21.setGravity(this.djBIcL);
        android.view.View viewFindViewById6 = this.AkhnZx.findViewById(MW.Activity.djBIcL);
        Intrinsics.copydefault(viewFindViewById6, "");
        WheelView wheelView22 = (WheelView) viewFindViewById6;
        this.ejfBZ = wheelView22;
        if (wheelView22 == null) {
            Intrinsics.gEmmrt("");
            wheelView22 = null;
        }
        wheelView22.setAdapter(new MU(0, 59));
        WheelView wheelView23 = this.ejfBZ;
        if (wheelView23 == null) {
            Intrinsics.gEmmrt("");
            wheelView23 = null;
        }
        wheelView23.setCurrentItem(i5);
        WheelView wheelView24 = this.ejfBZ;
        if (wheelView24 == null) {
            Intrinsics.gEmmrt("");
            wheelView24 = null;
        }
        wheelView24.setGravity(this.djBIcL);
        WheelView wheelView25 = this.hDKMBd;
        if (wheelView25 == null) {
            Intrinsics.gEmmrt("");
            wheelView25 = null;
        }
        wheelView25.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: o.axI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i6) {
                C8147axJ.EZpvd(this.copydefault, i6);
            }
        });
        WheelView wheelView26 = this.AuCTel;
        if (wheelView26 == null) {
            Intrinsics.gEmmrt("");
            wheelView26 = null;
        }
        wheelView26.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: o.axL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i6) {
                C8147axJ.djBIcL(this.copydefault, i6);
            }
        });
        WheelView wheelView27 = this.fIwbmz;
        if (wheelView27 == null) {
            Intrinsics.gEmmrt("");
            wheelView27 = null;
        }
        AEQbTJ(wheelView27);
        WheelView wheelView28 = this.fJNWhG;
        if (wheelView28 == null) {
            Intrinsics.gEmmrt("");
            wheelView28 = null;
        }
        AEQbTJ(wheelView28);
        WheelView wheelView29 = this.fARcdN;
        if (wheelView29 == null) {
            Intrinsics.gEmmrt("");
            wheelView29 = null;
        }
        AEQbTJ(wheelView29);
        WheelView wheelView30 = this.ejfBZ;
        if (wheelView30 == null) {
            Intrinsics.gEmmrt("");
            wheelView30 = null;
        }
        AEQbTJ(wheelView30);
        if (this.values.length != 6) {
            throw new java.lang.RuntimeException("type[] length is not 6");
        }
        WheelView wheelView31 = this.hDKMBd;
        if (wheelView31 == null) {
            Intrinsics.gEmmrt("");
            wheelView31 = null;
        }
        wheelView31.setVisibility(this.values[0] ? 0 : 8);
        WheelView wheelView32 = this.AuCTel;
        if (wheelView32 == null) {
            Intrinsics.gEmmrt("");
            wheelView32 = null;
        }
        wheelView32.setVisibility(this.values[1] ? 0 : 8);
        WheelView wheelView33 = this.fIwbmz;
        if (wheelView33 == null) {
            Intrinsics.gEmmrt("");
            wheelView33 = null;
        }
        wheelView33.setVisibility(this.values[2] ? 0 : 8);
        WheelView wheelView34 = this.fIwbmz;
        if (wheelView34 == null) {
            Intrinsics.gEmmrt("");
            wheelView34 = null;
        }
        wheelView34.setVisibility(this.values[3] ? 0 : 8);
        WheelView wheelView35 = this.fARcdN;
        if (wheelView35 == null) {
            Intrinsics.gEmmrt("");
            wheelView35 = null;
        }
        wheelView35.setVisibility(this.values[4] ? 0 : 8);
        WheelView wheelView36 = this.ejfBZ;
        if (wheelView36 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView36;
        }
        wheelView2.setVisibility(this.values[5] ? 0 : 8);
        copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(C8147axJ c8147axJ, int i) {
        int iCopydefault;
        int i2 = i + c8147axJ.DbNXlk;
        WheelView wheelView = c8147axJ.AuCTel;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setAdapter(new MT(C5320Ne.KWHzl(i2)));
        if (C5320Ne.AYXKKw(i2) == 0) {
            WheelView wheelView3 = c8147axJ.AuCTel;
            if (wheelView3 == null) {
                Intrinsics.gEmmrt("");
                wheelView3 = null;
            }
            WheelView wheelView4 = c8147axJ.AuCTel;
            if (wheelView4 == null) {
                Intrinsics.gEmmrt("");
                wheelView4 = null;
            }
            wheelView3.setCurrentItem(wheelView4.getCurrentItem());
        } else {
            WheelView wheelView5 = c8147axJ.AuCTel;
            if (wheelView5 == null) {
                Intrinsics.gEmmrt("");
                wheelView5 = null;
            }
            if (wheelView5.getCurrentItem() > C5320Ne.AYXKKw(i2) - 1) {
                WheelView wheelView6 = c8147axJ.AuCTel;
                if (wheelView6 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView6 = null;
                }
                WheelView wheelView7 = c8147axJ.AuCTel;
                if (wheelView7 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView7 = null;
                }
                wheelView6.setCurrentItem(wheelView7.getCurrentItem() + 1);
            }
        }
        WheelView wheelView8 = c8147axJ.fIwbmz;
        if (wheelView8 == null) {
            Intrinsics.gEmmrt("");
            wheelView8 = null;
        }
        int currentItem = wheelView8.getCurrentItem();
        if (C5320Ne.AYXKKw(i2) == 0) {
            WheelView wheelView9 = c8147axJ.fIwbmz;
            if (wheelView9 == null) {
                Intrinsics.gEmmrt("");
                wheelView9 = null;
            }
            WheelView wheelView10 = c8147axJ.AuCTel;
            if (wheelView10 == null) {
                Intrinsics.gEmmrt("");
                wheelView10 = null;
            }
            wheelView9.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(i2, wheelView10.getCurrentItem() + 1))));
            WheelView wheelView11 = c8147axJ.AuCTel;
            if (wheelView11 == null) {
                Intrinsics.gEmmrt("");
                wheelView11 = null;
            }
            iCopydefault = C5320Ne.copydefault(i2, wheelView11.getCurrentItem() + 1);
        } else {
            WheelView wheelView12 = c8147axJ.AuCTel;
            if (wheelView12 == null) {
                Intrinsics.gEmmrt("");
                wheelView12 = null;
            }
            if (wheelView12.getCurrentItem() > C5320Ne.AYXKKw(i2) - 1) {
                WheelView wheelView13 = c8147axJ.AuCTel;
                if (wheelView13 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView13 = null;
                }
                if (wheelView13.getCurrentItem() == C5320Ne.AYXKKw(i2) + 1) {
                    WheelView wheelView14 = c8147axJ.fIwbmz;
                    if (wheelView14 == null) {
                        Intrinsics.gEmmrt("");
                        wheelView14 = null;
                    }
                    wheelView14.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(i2))));
                    iCopydefault = C5320Ne.copydefault(i2);
                } else {
                    WheelView wheelView15 = c8147axJ.fIwbmz;
                    if (wheelView15 == null) {
                        Intrinsics.gEmmrt("");
                        wheelView15 = null;
                    }
                    WheelView wheelView16 = c8147axJ.AuCTel;
                    if (wheelView16 == null) {
                        Intrinsics.gEmmrt("");
                        wheelView16 = null;
                    }
                    wheelView15.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(i2, wheelView16.getCurrentItem()))));
                    WheelView wheelView17 = c8147axJ.AuCTel;
                    if (wheelView17 == null) {
                        Intrinsics.gEmmrt("");
                        wheelView17 = null;
                    }
                    iCopydefault = C5320Ne.copydefault(i2, wheelView17.getCurrentItem());
                }
            }
        }
        int i3 = iCopydefault - 1;
        if (currentItem > i3) {
            WheelView wheelView18 = c8147axJ.fIwbmz;
            if (wheelView18 == null) {
                Intrinsics.gEmmrt("");
            } else {
                wheelView2 = wheelView18;
            }
            wheelView2.setCurrentItem(i3);
        }
        InterfaceC5317Nb interfaceC5317Nb = c8147axJ.gEmmrt;
        if (interfaceC5317Nb != null) {
            Intrinsics.copydefault(interfaceC5317Nb);
            interfaceC5317Nb.AEQbTJ();
        }
    }

    public static final void djBIcL(C8147axJ c8147axJ, int i) {
        int iCopydefault;
        WheelView wheelView = c8147axJ.hDKMBd;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        int currentItem = wheelView.getCurrentItem() + c8147axJ.DbNXlk;
        WheelView wheelView3 = c8147axJ.fIwbmz;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        int currentItem2 = wheelView3.getCurrentItem();
        if (C5320Ne.AYXKKw(currentItem) != 0 && i > C5320Ne.AYXKKw(currentItem) - 1) {
            WheelView wheelView4 = c8147axJ.AuCTel;
            if (wheelView4 == null) {
                Intrinsics.gEmmrt("");
                wheelView4 = null;
            }
            if (wheelView4.getCurrentItem() == C5320Ne.AYXKKw(currentItem) + 1) {
                WheelView wheelView5 = c8147axJ.fIwbmz;
                if (wheelView5 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView5 = null;
                }
                wheelView5.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(currentItem))));
                iCopydefault = C5320Ne.copydefault(currentItem);
            } else {
                WheelView wheelView6 = c8147axJ.fIwbmz;
                if (wheelView6 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView6 = null;
                }
                wheelView6.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(currentItem, i))));
                iCopydefault = C5320Ne.copydefault(currentItem, i);
            }
        } else {
            WheelView wheelView7 = c8147axJ.fIwbmz;
            if (wheelView7 == null) {
                Intrinsics.gEmmrt("");
                wheelView7 = null;
            }
            int i2 = i + 1;
            wheelView7.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(currentItem, i2))));
            iCopydefault = C5320Ne.copydefault(currentItem, i2);
        }
        int i3 = iCopydefault - 1;
        if (currentItem2 > i3) {
            WheelView wheelView8 = c8147axJ.fIwbmz;
            if (wheelView8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                wheelView2 = wheelView8;
            }
            wheelView2.setCurrentItem(i3);
        }
        InterfaceC5317Nb interfaceC5317Nb = c8147axJ.gEmmrt;
        if (interfaceC5317Nb != null) {
            Intrinsics.copydefault(interfaceC5317Nb);
            interfaceC5317Nb.AEQbTJ();
        }
    }

    public final void EZpvd(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        WheelView wheelView;
        java.lang.String[] strArr = {"4", OrderDetailListItem.SLIP_OUT, "9", "11"};
        final java.util.List listAsList = java.util.Arrays.asList(java.util.Arrays.copyOf(new java.lang.String[]{"1", "3", "5", "7", "8", "10", "12"}, 7));
        final java.util.List listAsList2 = java.util.Arrays.asList(java.util.Arrays.copyOf(strArr, 4));
        this.EZpvd = i;
        android.view.View viewFindViewById = this.AkhnZx.findViewById(MW.Activity.isConnected);
        Intrinsics.copydefault(viewFindViewById, "");
        WheelView wheelView2 = (WheelView) viewFindViewById;
        this.hDKMBd = wheelView2;
        if (wheelView2 == null) {
            Intrinsics.gEmmrt("");
            wheelView2 = null;
        }
        wheelView2.setAdapter(new MU(this.DbNXlk, this.AEQbTJ));
        WheelView wheelView3 = this.hDKMBd;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setCurrentItem(i - this.DbNXlk);
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setGravity(this.djBIcL);
        android.view.View viewFindViewById2 = this.AkhnZx.findViewById(MW.Activity.gEmmrt);
        Intrinsics.copydefault(viewFindViewById2, "");
        WheelView wheelView5 = (WheelView) viewFindViewById2;
        this.AuCTel = wheelView5;
        int i12 = this.DbNXlk;
        int i13 = this.AEQbTJ;
        if (i12 == i13) {
            if (wheelView5 == null) {
                Intrinsics.gEmmrt("");
                wheelView5 = null;
            }
            wheelView5.setAdapter(new C8140axC(this.AhwBna, this.KWHzl));
            WheelView wheelView6 = this.AuCTel;
            if (wheelView6 == null) {
                Intrinsics.gEmmrt("");
                wheelView6 = null;
            }
            wheelView6.setCurrentItem((i2 + 1) - this.AhwBna);
        } else if (i == i12) {
            if (wheelView5 == null) {
                Intrinsics.gEmmrt("");
                wheelView5 = null;
            }
            wheelView5.setAdapter(new C8140axC(this.AhwBna, 12));
            WheelView wheelView7 = this.AuCTel;
            if (wheelView7 == null) {
                Intrinsics.gEmmrt("");
                wheelView7 = null;
            }
            wheelView7.setCurrentItem((i2 + 1) - this.AhwBna);
        } else if (i == i13) {
            if (wheelView5 == null) {
                Intrinsics.gEmmrt("");
                wheelView5 = null;
            }
            wheelView5.setAdapter(new C8140axC(1, this.KWHzl));
            WheelView wheelView8 = this.AuCTel;
            if (wheelView8 == null) {
                Intrinsics.gEmmrt("");
                wheelView8 = null;
            }
            wheelView8.setCurrentItem(i2);
        } else {
            if (wheelView5 == null) {
                Intrinsics.gEmmrt("");
                wheelView5 = null;
            }
            wheelView5.setAdapter(new C8140axC(1, 12));
            WheelView wheelView9 = this.AuCTel;
            if (wheelView9 == null) {
                Intrinsics.gEmmrt("");
                wheelView9 = null;
            }
            wheelView9.setCurrentItem(i2);
        }
        WheelView wheelView10 = this.AuCTel;
        if (wheelView10 == null) {
            Intrinsics.gEmmrt("");
            wheelView10 = null;
        }
        wheelView10.setGravity(this.djBIcL);
        android.view.View viewFindViewById3 = this.AkhnZx.findViewById(MW.Activity.OLrzqt);
        Intrinsics.copydefault(viewFindViewById3, "");
        this.fIwbmz = (WheelView) viewFindViewById3;
        boolean z = (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
        int i14 = this.DbNXlk;
        int i15 = this.AEQbTJ;
        if (i14 == i15 && this.AhwBna == this.KWHzl) {
            int i16 = i2 + 1;
            if (listAsList.contains(java.lang.String.valueOf(i16))) {
                if (this.copydefault > 31) {
                    this.copydefault = 31;
                }
                WheelView wheelView11 = this.fIwbmz;
                if (wheelView11 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView11 = null;
                }
                wheelView11.setAdapter(new MU(this.valueOf, this.copydefault));
            } else if (listAsList2.contains(java.lang.String.valueOf(i16))) {
                if (this.copydefault > 30) {
                    this.copydefault = 30;
                }
                WheelView wheelView12 = this.fIwbmz;
                if (wheelView12 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView12 = null;
                }
                wheelView12.setAdapter(new MU(this.valueOf, this.copydefault));
            } else if (z) {
                if (this.copydefault > 29) {
                    this.copydefault = 29;
                }
                WheelView wheelView13 = this.fIwbmz;
                if (wheelView13 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView13 = null;
                }
                wheelView13.setAdapter(new MU(this.valueOf, this.copydefault));
            } else {
                if (this.copydefault > 28) {
                    this.copydefault = 28;
                }
                WheelView wheelView14 = this.fIwbmz;
                if (wheelView14 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView14 = null;
                }
                wheelView14.setAdapter(new MU(this.valueOf, this.copydefault));
            }
            WheelView wheelView15 = this.fIwbmz;
            if (wheelView15 == null) {
                Intrinsics.gEmmrt("");
                wheelView15 = null;
            }
            wheelView15.setCurrentItem(i3 - this.valueOf);
        } else if (i == i14 && (i8 = i2 + 1) == this.AhwBna) {
            if (listAsList.contains(java.lang.String.valueOf(i8))) {
                WheelView wheelView16 = this.fIwbmz;
                if (wheelView16 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView16 = null;
                }
                wheelView16.setAdapter(new MU(this.valueOf, 31));
            } else if (listAsList2.contains(java.lang.String.valueOf(i8))) {
                WheelView wheelView17 = this.fIwbmz;
                if (wheelView17 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView17 = null;
                }
                wheelView17.setAdapter(new MU(this.valueOf, 30));
            } else {
                WheelView wheelView18 = this.fIwbmz;
                if (wheelView18 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView18 = null;
                }
                wheelView18.setAdapter(new MU(this.valueOf, z ? 29 : 28));
            }
            WheelView wheelView19 = this.fIwbmz;
            if (wheelView19 == null) {
                Intrinsics.gEmmrt("");
                wheelView19 = null;
            }
            wheelView19.setCurrentItem(i3 - this.valueOf);
        } else if (i == i15 && (i7 = i2 + 1) == this.KWHzl) {
            if (listAsList.contains(java.lang.String.valueOf(i7))) {
                if (this.copydefault > 31) {
                    this.copydefault = 31;
                }
                WheelView wheelView20 = this.fIwbmz;
                if (wheelView20 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView20 = null;
                }
                wheelView20.setAdapter(new MU(1, this.copydefault));
            } else if (listAsList2.contains(java.lang.String.valueOf(i7))) {
                if (this.copydefault > 30) {
                    this.copydefault = 30;
                }
                WheelView wheelView21 = this.fIwbmz;
                if (wheelView21 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView21 = null;
                }
                wheelView21.setAdapter(new MU(1, this.copydefault));
            } else if (z) {
                if (this.copydefault > 29) {
                    this.copydefault = 29;
                }
                WheelView wheelView22 = this.fIwbmz;
                if (wheelView22 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView22 = null;
                }
                wheelView22.setAdapter(new MU(1, this.copydefault));
            } else {
                if (this.copydefault > 28) {
                    this.copydefault = 28;
                }
                WheelView wheelView23 = this.fIwbmz;
                if (wheelView23 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView23 = null;
                }
                wheelView23.setAdapter(new MU(1, this.copydefault));
            }
            WheelView wheelView24 = this.fIwbmz;
            if (wheelView24 == null) {
                Intrinsics.gEmmrt("");
                wheelView24 = null;
            }
            wheelView24.setCurrentItem(i3 - 1);
        } else {
            int i17 = i2 + 1;
            if (listAsList.contains(java.lang.String.valueOf(i17))) {
                WheelView wheelView25 = this.fIwbmz;
                if (wheelView25 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView25 = null;
                }
                wheelView25.setAdapter(new MU(1, 31));
            } else if (listAsList2.contains(java.lang.String.valueOf(i17))) {
                WheelView wheelView26 = this.fIwbmz;
                if (wheelView26 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView26 = null;
                }
                wheelView26.setAdapter(new MU(1, 30));
            } else {
                WheelView wheelView27 = this.fIwbmz;
                if (wheelView27 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView27 = null;
                }
                wheelView27.setAdapter(new MU(this.valueOf, z ? 29 : 28));
            }
            WheelView wheelView28 = this.fIwbmz;
            if (wheelView28 == null) {
                Intrinsics.gEmmrt("");
                wheelView28 = null;
            }
            wheelView28.setCurrentItem(i3 - 1);
        }
        WheelView wheelView29 = this.fIwbmz;
        if (wheelView29 == null) {
            Intrinsics.gEmmrt("");
            wheelView29 = null;
        }
        wheelView29.setGravity(this.djBIcL);
        android.view.View viewFindViewById4 = this.AkhnZx.findViewById(MW.Activity.KWHzl);
        Intrinsics.copydefault(viewFindViewById4, "");
        WheelView wheelView30 = (WheelView) viewFindViewById4;
        this.fJNWhG = wheelView30;
        if (wheelView30 == null) {
            Intrinsics.gEmmrt("");
            wheelView30 = null;
        }
        wheelView30.setAdapter(new MU(0, 23));
        WheelView wheelView31 = this.fJNWhG;
        if (wheelView31 == null) {
            Intrinsics.gEmmrt("");
            i9 = i4;
            wheelView31 = null;
        } else {
            i9 = i4;
        }
        wheelView31.setCurrentItem(i9);
        WheelView wheelView32 = this.fJNWhG;
        if (wheelView32 == null) {
            Intrinsics.gEmmrt("");
            wheelView32 = null;
        }
        wheelView32.setGravity(this.djBIcL);
        android.view.View viewFindViewById5 = this.AkhnZx.findViewById(MW.Activity.valueOf);
        Intrinsics.copydefault(viewFindViewById5, "");
        WheelView wheelView33 = (WheelView) viewFindViewById5;
        this.fARcdN = wheelView33;
        if (wheelView33 == null) {
            Intrinsics.gEmmrt("");
            wheelView33 = null;
        }
        wheelView33.setAdapter(new MU(0, 59));
        WheelView wheelView34 = this.fARcdN;
        if (wheelView34 == null) {
            Intrinsics.gEmmrt("");
            i10 = i5;
            wheelView34 = null;
        } else {
            i10 = i5;
        }
        wheelView34.setCurrentItem(i10);
        WheelView wheelView35 = this.fARcdN;
        if (wheelView35 == null) {
            Intrinsics.gEmmrt("");
            wheelView35 = null;
        }
        wheelView35.setGravity(this.djBIcL);
        android.view.View viewFindViewById6 = this.AkhnZx.findViewById(MW.Activity.djBIcL);
        Intrinsics.copydefault(viewFindViewById6, "");
        WheelView wheelView36 = (WheelView) viewFindViewById6;
        this.ejfBZ = wheelView36;
        if (wheelView36 == null) {
            Intrinsics.gEmmrt("");
            wheelView36 = null;
        }
        wheelView36.setAdapter(new MU(0, 59));
        WheelView wheelView37 = this.ejfBZ;
        if (wheelView37 == null) {
            Intrinsics.gEmmrt("");
            i11 = i6;
            wheelView37 = null;
        } else {
            i11 = i6;
        }
        wheelView37.setCurrentItem(i11);
        WheelView wheelView38 = this.ejfBZ;
        if (wheelView38 == null) {
            Intrinsics.gEmmrt("");
            wheelView38 = null;
        }
        wheelView38.setGravity(this.djBIcL);
        WheelView wheelView39 = this.hDKMBd;
        if (wheelView39 == null) {
            Intrinsics.gEmmrt("");
            wheelView39 = null;
        }
        wheelView39.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: o.axK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i18) {
                C8147axJ.OLrzqt(this.copydefault, listAsList, listAsList2, i18);
            }
        });
        WheelView wheelView40 = this.AuCTel;
        if (wheelView40 == null) {
            Intrinsics.gEmmrt("");
            wheelView40 = null;
        }
        wheelView40.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: o.axO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i18) {
                C8147axJ.copydefault(this.AEQbTJ, listAsList, listAsList2, i18);
            }
        });
        WheelView wheelView41 = this.fIwbmz;
        if (wheelView41 == null) {
            Intrinsics.gEmmrt("");
            wheelView41 = null;
        }
        AEQbTJ(wheelView41);
        WheelView wheelView42 = this.fJNWhG;
        if (wheelView42 == null) {
            Intrinsics.gEmmrt("");
            wheelView42 = null;
        }
        AEQbTJ(wheelView42);
        WheelView wheelView43 = this.fARcdN;
        if (wheelView43 == null) {
            Intrinsics.gEmmrt("");
            wheelView43 = null;
        }
        AEQbTJ(wheelView43);
        WheelView wheelView44 = this.ejfBZ;
        if (wheelView44 == null) {
            Intrinsics.gEmmrt("");
            wheelView44 = null;
        }
        AEQbTJ(wheelView44);
        if (this.values.length != 6) {
            throw new java.lang.IllegalArgumentException("type[] length is not 6".toString());
        }
        WheelView wheelView45 = this.hDKMBd;
        if (wheelView45 == null) {
            Intrinsics.gEmmrt("");
            wheelView45 = null;
        }
        wheelView45.setVisibility(this.values[0] ? 0 : 8);
        WheelView wheelView46 = this.AuCTel;
        if (wheelView46 == null) {
            Intrinsics.gEmmrt("");
            wheelView46 = null;
        }
        wheelView46.setVisibility(this.values[1] ? 0 : 8);
        WheelView wheelView47 = this.fIwbmz;
        if (wheelView47 == null) {
            Intrinsics.gEmmrt("");
            wheelView47 = null;
        }
        wheelView47.setVisibility(this.values[2] ? 0 : 8);
        WheelView wheelView48 = this.fJNWhG;
        if (wheelView48 == null) {
            Intrinsics.gEmmrt("");
            wheelView48 = null;
        }
        wheelView48.setVisibility(this.values[3] ? 0 : 8);
        WheelView wheelView49 = this.fARcdN;
        if (wheelView49 == null) {
            Intrinsics.gEmmrt("");
            wheelView49 = null;
        }
        wheelView49.setVisibility(this.values[4] ? 0 : 8);
        WheelView wheelView50 = this.ejfBZ;
        if (wheelView50 == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        } else {
            wheelView = wheelView50;
        }
        wheelView.setVisibility(this.values[5] ? 0 : 8);
        copydefault();
    }

    public static final void OLrzqt(C8147axJ c8147axJ, java.util.List list, java.util.List list2, int i) {
        int i2 = i + c8147axJ.DbNXlk;
        c8147axJ.EZpvd = i2;
        WheelView wheelView = c8147axJ.AuCTel;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        int currentItem = wheelView.getCurrentItem();
        int i3 = c8147axJ.DbNXlk;
        int i4 = c8147axJ.AEQbTJ;
        if (i3 == i4) {
            WheelView wheelView3 = c8147axJ.AuCTel;
            if (wheelView3 == null) {
                Intrinsics.gEmmrt("");
                wheelView3 = null;
            }
            wheelView3.setAdapter(new C8140axC(c8147axJ.AhwBna, c8147axJ.KWHzl));
            WheelView wheelView4 = c8147axJ.AuCTel;
            if (wheelView4 == null) {
                Intrinsics.gEmmrt("");
                wheelView4 = null;
            }
            if (currentItem > wheelView4.getAdapter().getItemsCount() - 1) {
                WheelView wheelView5 = c8147axJ.AuCTel;
                if (wheelView5 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView5 = null;
                }
                currentItem = wheelView5.getAdapter().getItemsCount() - 1;
                WheelView wheelView6 = c8147axJ.AuCTel;
                if (wheelView6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    wheelView2 = wheelView6;
                }
                wheelView2.setCurrentItem(currentItem);
            }
            int i5 = c8147axJ.AhwBna;
            int i6 = currentItem + i5;
            int i7 = c8147axJ.KWHzl;
            if (i5 == i7) {
                int i8 = c8147axJ.valueOf;
                int i9 = c8147axJ.copydefault;
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i2, i6, i8, i9, list, list2);
            } else if (i6 == i5) {
                int i10 = c8147axJ.valueOf;
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i2, i6, i10, 31, list, list2);
            } else if (i6 == i7) {
                int i11 = c8147axJ.copydefault;
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i2, i6, 1, i11, list, list2);
            } else {
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i2, i6, 1, 31, list, list2);
            }
        } else if (i2 == i3) {
            WheelView wheelView7 = c8147axJ.AuCTel;
            if (wheelView7 == null) {
                Intrinsics.gEmmrt("");
                wheelView7 = null;
            }
            wheelView7.setAdapter(new C8140axC(c8147axJ.AhwBna, 12));
            WheelView wheelView8 = c8147axJ.AuCTel;
            if (wheelView8 == null) {
                Intrinsics.gEmmrt("");
                wheelView8 = null;
            }
            if (currentItem > wheelView8.getAdapter().getItemsCount() - 1) {
                WheelView wheelView9 = c8147axJ.AuCTel;
                if (wheelView9 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView9 = null;
                }
                currentItem = wheelView9.getAdapter().getItemsCount() - 1;
                WheelView wheelView10 = c8147axJ.AuCTel;
                if (wheelView10 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    wheelView2 = wheelView10;
                }
                wheelView2.setCurrentItem(currentItem);
            }
            int i12 = c8147axJ.AhwBna;
            int i13 = currentItem + i12;
            if (i13 == i12) {
                int i14 = c8147axJ.valueOf;
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i2, i13, i14, 31, list, list2);
            } else {
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i2, i13, 1, 31, list, list2);
            }
        } else if (i2 == i4) {
            WheelView wheelView11 = c8147axJ.AuCTel;
            if (wheelView11 == null) {
                Intrinsics.gEmmrt("");
                wheelView11 = null;
            }
            wheelView11.setAdapter(new C8140axC(1, c8147axJ.KWHzl));
            WheelView wheelView12 = c8147axJ.AuCTel;
            if (wheelView12 == null) {
                Intrinsics.gEmmrt("");
                wheelView12 = null;
            }
            if (currentItem > wheelView12.getAdapter().getItemsCount() - 1) {
                WheelView wheelView13 = c8147axJ.AuCTel;
                if (wheelView13 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView13 = null;
                }
                currentItem = wheelView13.getAdapter().getItemsCount() - 1;
                WheelView wheelView14 = c8147axJ.AuCTel;
                if (wheelView14 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    wheelView2 = wheelView14;
                }
                wheelView2.setCurrentItem(currentItem);
            }
            int i15 = currentItem + 1;
            if (i15 == c8147axJ.KWHzl) {
                int i16 = c8147axJ.copydefault;
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i2, i15, 1, i16, list, list2);
            } else {
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i2, i15, 1, 31, list, list2);
            }
        } else {
            WheelView wheelView15 = c8147axJ.AuCTel;
            if (wheelView15 == null) {
                Intrinsics.gEmmrt("");
                wheelView15 = null;
            }
            wheelView15.setAdapter(new C8140axC(1, 12));
            WheelView wheelView16 = c8147axJ.AuCTel;
            if (wheelView16 == null) {
                Intrinsics.gEmmrt("");
            } else {
                wheelView2 = wheelView16;
            }
            int currentItem2 = wheelView2.getCurrentItem();
            Intrinsics.copydefault(list);
            Intrinsics.copydefault(list2);
            c8147axJ.OLrzqt(i2, currentItem2 + 1, 1, 31, list, list2);
        }
        InterfaceC5317Nb interfaceC5317Nb = c8147axJ.gEmmrt;
        if (interfaceC5317Nb != null) {
            Intrinsics.copydefault(interfaceC5317Nb);
            interfaceC5317Nb.AEQbTJ();
        }
    }

    public static final void copydefault(C8147axJ c8147axJ, java.util.List list, java.util.List list2, int i) {
        int i2 = i + 1;
        int i3 = c8147axJ.DbNXlk;
        int i4 = c8147axJ.AEQbTJ;
        if (i3 == i4) {
            int i5 = c8147axJ.AhwBna;
            int i6 = (i2 + i5) - 1;
            int i7 = c8147axJ.KWHzl;
            if (i5 == i7) {
                int i8 = c8147axJ.EZpvd;
                int i9 = c8147axJ.valueOf;
                int i10 = c8147axJ.copydefault;
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i8, i6, i9, i10, list, list2);
            } else if (i5 == i6) {
                int i11 = c8147axJ.EZpvd;
                int i12 = c8147axJ.valueOf;
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i11, i6, i12, 31, list, list2);
            } else if (i7 == i6) {
                int i13 = c8147axJ.EZpvd;
                int i14 = c8147axJ.copydefault;
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i13, i6, 1, i14, list, list2);
            } else {
                int i15 = c8147axJ.EZpvd;
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i15, i6, 1, 31, list, list2);
            }
        } else {
            int i16 = c8147axJ.EZpvd;
            if (i16 == i3) {
                int i17 = c8147axJ.AhwBna;
                int i18 = (i2 + i17) - 1;
                if (i18 == i17) {
                    int i19 = c8147axJ.valueOf;
                    Intrinsics.copydefault(list);
                    Intrinsics.copydefault(list2);
                    c8147axJ.OLrzqt(i16, i18, i19, 31, list, list2);
                } else {
                    Intrinsics.copydefault(list);
                    Intrinsics.copydefault(list2);
                    c8147axJ.OLrzqt(i16, i18, 1, 31, list, list2);
                }
            } else if (i16 == i4) {
                WheelView wheelView = null;
                if (i2 == c8147axJ.KWHzl) {
                    WheelView wheelView2 = c8147axJ.AuCTel;
                    if (wheelView2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        wheelView = wheelView2;
                    }
                    int currentItem = wheelView.getCurrentItem();
                    int i20 = c8147axJ.copydefault;
                    Intrinsics.copydefault(list);
                    Intrinsics.copydefault(list2);
                    c8147axJ.OLrzqt(i16, currentItem + 1, 1, i20, list, list2);
                } else {
                    WheelView wheelView3 = c8147axJ.AuCTel;
                    if (wheelView3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        wheelView = wheelView3;
                    }
                    int currentItem2 = wheelView.getCurrentItem();
                    Intrinsics.copydefault(list);
                    Intrinsics.copydefault(list2);
                    c8147axJ.OLrzqt(i16, currentItem2 + 1, 1, 31, list, list2);
                }
            } else {
                Intrinsics.copydefault(list);
                Intrinsics.copydefault(list2);
                c8147axJ.OLrzqt(i16, i2, 1, 31, list, list2);
            }
        }
        InterfaceC5317Nb interfaceC5317Nb = c8147axJ.gEmmrt;
        if (interfaceC5317Nb != null) {
            Intrinsics.copydefault(interfaceC5317Nb);
            interfaceC5317Nb.AEQbTJ();
        }
    }

    public static final void OLrzqt(C8147axJ c8147axJ, int i) {
        InterfaceC5317Nb interfaceC5317Nb = c8147axJ.gEmmrt;
        Intrinsics.copydefault(interfaceC5317Nb);
        interfaceC5317Nb.AEQbTJ();
    }

    public final void AEQbTJ(WheelView wheelView) {
        if (this.gEmmrt != null) {
            Intrinsics.copydefault(wheelView);
            wheelView.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: o.axN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.contrarywind.listener.OnItemSelectedListener
                public final void onItemSelected(int i) {
                    C8147axJ.OLrzqt(this.AEQbTJ, i);
                }
            });
        }
    }

    public final void OLrzqt(int i, int i2, int i3, int i4, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        WheelView wheelView = this.fIwbmz;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        int currentItem = wheelView.getCurrentItem();
        if (list.contains(java.lang.String.valueOf(i2))) {
            if (i4 > 31) {
                i4 = 31;
            }
            WheelView wheelView3 = this.fIwbmz;
            if (wheelView3 == null) {
                Intrinsics.gEmmrt("");
                wheelView3 = null;
            }
            wheelView3.setAdapter(new MU(i3, i4));
        } else if (list2.contains(java.lang.String.valueOf(i2))) {
            if (i4 > 30) {
                i4 = 30;
            }
            WheelView wheelView4 = this.fIwbmz;
            if (wheelView4 == null) {
                Intrinsics.gEmmrt("");
                wheelView4 = null;
            }
            wheelView4.setAdapter(new MU(i3, i4));
        } else if ((i % 4 != 0 || i % 100 == 0) && i % 400 != 0) {
            if (i4 > 28) {
                i4 = 28;
            }
            WheelView wheelView5 = this.fIwbmz;
            if (wheelView5 == null) {
                Intrinsics.gEmmrt("");
                wheelView5 = null;
            }
            wheelView5.setAdapter(new MU(i3, i4));
        } else {
            if (i4 > 29) {
                i4 = 29;
            }
            WheelView wheelView6 = this.fIwbmz;
            if (wheelView6 == null) {
                Intrinsics.gEmmrt("");
                wheelView6 = null;
            }
            wheelView6.setAdapter(new MU(i3, i4));
        }
        WheelView wheelView7 = this.fIwbmz;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
            wheelView7 = null;
        }
        if (currentItem > wheelView7.getAdapter().getItemsCount() - 1) {
            WheelView wheelView8 = this.fIwbmz;
            if (wheelView8 == null) {
                Intrinsics.gEmmrt("");
                wheelView8 = null;
            }
            int itemsCount = wheelView8.getAdapter().getItemsCount();
            WheelView wheelView9 = this.fIwbmz;
            if (wheelView9 == null) {
                Intrinsics.gEmmrt("");
            } else {
                wheelView2 = wheelView9;
            }
            wheelView2.setCurrentItem(itemsCount - 1);
        }
    }

    public final void copydefault() {
        WheelView wheelView = this.fIwbmz;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setTextSize(this.fetchVPNInfo);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setTextSize(this.fetchVPNInfo);
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setTextSize(this.fetchVPNInfo);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setTextSize(this.fetchVPNInfo);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setTextSize(this.fetchVPNInfo);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.setTextSize(this.fetchVPNInfo);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (this.AYXKKw) {
            return;
        }
        WheelView wheelView = null;
        if (str != null) {
            WheelView wheelView2 = this.hDKMBd;
            if (wheelView2 == null) {
                Intrinsics.gEmmrt("");
                wheelView2 = null;
            }
            wheelView2.setLabel(str);
        } else {
            WheelView wheelView3 = this.hDKMBd;
            if (wheelView3 == null) {
                Intrinsics.gEmmrt("");
                wheelView3 = null;
            }
            wheelView3.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.gEmmrt));
        }
        if (str2 != null) {
            WheelView wheelView4 = this.AuCTel;
            if (wheelView4 == null) {
                Intrinsics.gEmmrt("");
                wheelView4 = null;
            }
            wheelView4.setLabel(str2);
        } else {
            WheelView wheelView5 = this.AuCTel;
            if (wheelView5 == null) {
                Intrinsics.gEmmrt("");
                wheelView5 = null;
            }
            wheelView5.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.OLrzqt));
        }
        if (str3 != null) {
            WheelView wheelView6 = this.fIwbmz;
            if (wheelView6 == null) {
                Intrinsics.gEmmrt("");
                wheelView6 = null;
            }
            wheelView6.setLabel(str3);
        } else {
            WheelView wheelView7 = this.fIwbmz;
            if (wheelView7 == null) {
                Intrinsics.gEmmrt("");
                wheelView7 = null;
            }
            wheelView7.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.KWHzl));
        }
        if (str4 != null) {
            WheelView wheelView8 = this.fJNWhG;
            if (wheelView8 == null) {
                Intrinsics.gEmmrt("");
                wheelView8 = null;
            }
            wheelView8.setLabel(str4);
        } else {
            WheelView wheelView9 = this.fJNWhG;
            if (wheelView9 == null) {
                Intrinsics.gEmmrt("");
                wheelView9 = null;
            }
            wheelView9.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.AEQbTJ));
        }
        if (str5 != null) {
            WheelView wheelView10 = this.fARcdN;
            if (wheelView10 == null) {
                Intrinsics.gEmmrt("");
                wheelView10 = null;
            }
            wheelView10.setLabel(str5);
        } else {
            WheelView wheelView11 = this.fARcdN;
            if (wheelView11 == null) {
                Intrinsics.gEmmrt("");
                wheelView11 = null;
            }
            wheelView11.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.copydefault));
        }
        if (str6 != null) {
            WheelView wheelView12 = this.ejfBZ;
            if (wheelView12 == null) {
                Intrinsics.gEmmrt("");
            } else {
                wheelView = wheelView12;
            }
            wheelView.setLabel(str6);
            return;
        }
        WheelView wheelView13 = this.ejfBZ;
        if (wheelView13 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView = wheelView13;
        }
        wheelView.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.AYXKKw));
    }

    public final void copydefault(int i, int i2, int i3, int i4, int i5, int i6) {
        WheelView wheelView = this.hDKMBd;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setTextXOffset(i);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setTextXOffset(i2);
        WheelView wheelView4 = this.fIwbmz;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setTextXOffset(i3);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setTextXOffset(i4);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setTextXOffset(i5);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.setTextXOffset(i6);
    }

    public final void copydefault(boolean z) {
        WheelView wheelView = this.hDKMBd;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setCyclic(z);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setCyclic(z);
        WheelView wheelView4 = this.fIwbmz;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setCyclic(z);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setCyclic(z);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setCyclic(z);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.setCyclic(z);
    }

    public final Date EZpvd() {
        if (this.AYXKKw) {
            return KWHzl();
        }
        Calendar calendar = Calendar.getInstance(this.isConnected);
        WheelView wheelView = this.hDKMBd;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        calendar.set(1, wheelView.getCurrentItem() + this.DbNXlk);
        if (this.EZpvd == this.DbNXlk) {
            WheelView wheelView3 = this.AuCTel;
            if (wheelView3 == null) {
                Intrinsics.gEmmrt("");
                wheelView3 = null;
            }
            calendar.set(2, (wheelView3.getCurrentItem() + this.AhwBna) - 1);
            WheelView wheelView4 = this.AuCTel;
            if (wheelView4 == null) {
                Intrinsics.gEmmrt("");
                wheelView4 = null;
            }
            int currentItem = wheelView4.getCurrentItem();
            int i = this.AhwBna;
            if (currentItem + i == i) {
                WheelView wheelView5 = this.fIwbmz;
                if (wheelView5 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView5 = null;
                }
                calendar.set(5, wheelView5.getCurrentItem() + this.valueOf);
            } else {
                WheelView wheelView6 = this.fIwbmz;
                if (wheelView6 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView6 = null;
                }
                calendar.set(5, wheelView6.getCurrentItem() + 1);
            }
        } else {
            WheelView wheelView7 = this.AuCTel;
            if (wheelView7 == null) {
                Intrinsics.gEmmrt("");
                wheelView7 = null;
            }
            calendar.set(2, wheelView7.getCurrentItem());
            WheelView wheelView8 = this.fIwbmz;
            if (wheelView8 == null) {
                Intrinsics.gEmmrt("");
                wheelView8 = null;
            }
            calendar.set(5, wheelView8.getCurrentItem() + 1);
        }
        WheelView wheelView9 = this.fJNWhG;
        if (wheelView9 == null) {
            Intrinsics.gEmmrt("");
            wheelView9 = null;
        }
        calendar.set(11, wheelView9.getCurrentItem());
        WheelView wheelView10 = this.fARcdN;
        if (wheelView10 == null) {
            Intrinsics.gEmmrt("");
            wheelView10 = null;
        }
        calendar.set(12, wheelView10.getCurrentItem());
        WheelView wheelView11 = this.ejfBZ;
        if (wheelView11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView11;
        }
        calendar.set(13, wheelView2.getCurrentItem());
        calendar.set(14, 0);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        return time;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Date KWHzl() {
        int currentItem;
        boolean z;
        int currentItem2;
        WheelView wheelView;
        WheelView wheelView2;
        WheelView wheelView3;
        WheelView wheelView4;
        Calendar calendar = Calendar.getInstance(yCN.OLrzqt("GMT+8"));
        WheelView wheelView5 = this.hDKMBd;
        WheelView wheelView6 = null;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        int currentItem3 = wheelView5.getCurrentItem() + this.DbNXlk;
        if (C5320Ne.AYXKKw(currentItem3) == 0) {
            WheelView wheelView7 = this.AuCTel;
            if (wheelView7 == null) {
                Intrinsics.gEmmrt("");
                wheelView7 = null;
            }
            currentItem2 = wheelView7.getCurrentItem();
        } else {
            WheelView wheelView8 = this.AuCTel;
            if (wheelView8 == null) {
                Intrinsics.gEmmrt("");
                wheelView8 = null;
            }
            if ((wheelView8.getCurrentItem() + 1) - C5320Ne.AYXKKw(currentItem3) > 0) {
                WheelView wheelView9 = this.AuCTel;
                if (wheelView9 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView9 = null;
                }
                if ((wheelView9.getCurrentItem() + 1) - C5320Ne.AYXKKw(currentItem3) == 1) {
                    WheelView wheelView10 = this.AuCTel;
                    if (wheelView10 == null) {
                        Intrinsics.gEmmrt("");
                        wheelView10 = null;
                    }
                    currentItem = wheelView10.getCurrentItem();
                    z = true;
                    wheelView = this.fIwbmz;
                    if (wheelView == null) {
                        Intrinsics.gEmmrt("");
                        wheelView = null;
                    }
                    int[] iArrOLrzqt = C5322Ng.OLrzqt(currentItem3, currentItem, wheelView.getCurrentItem() + 1, z);
                    calendar.set(1, iArrOLrzqt[0]);
                    calendar.set(2, iArrOLrzqt[1]);
                    calendar.set(5, iArrOLrzqt[2]);
                    wheelView2 = this.fJNWhG;
                    if (wheelView2 == null) {
                        Intrinsics.gEmmrt("");
                        wheelView2 = null;
                    }
                    calendar.set(11, wheelView2.getCurrentItem());
                    wheelView3 = this.fARcdN;
                    if (wheelView3 == null) {
                        Intrinsics.gEmmrt("");
                        wheelView3 = null;
                    }
                    calendar.set(12, wheelView3.getCurrentItem());
                    wheelView4 = this.ejfBZ;
                    if (wheelView4 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        wheelView6 = wheelView4;
                    }
                    calendar.set(13, wheelView6.getCurrentItem());
                    calendar.set(14, 0);
                    Date time = calendar.getTime();
                    Intrinsics.checkNotNullExpressionValue(time, "");
                    return time;
                }
                WheelView wheelView11 = this.AuCTel;
                if (wheelView11 == null) {
                    Intrinsics.gEmmrt("");
                    wheelView11 = null;
                }
                currentItem = wheelView11.getCurrentItem();
                z = false;
                wheelView = this.fIwbmz;
                if (wheelView == null) {
                }
                int[] iArrOLrzqt2 = C5322Ng.OLrzqt(currentItem3, currentItem, wheelView.getCurrentItem() + 1, z);
                calendar.set(1, iArrOLrzqt2[0]);
                calendar.set(2, iArrOLrzqt2[1]);
                calendar.set(5, iArrOLrzqt2[2]);
                wheelView2 = this.fJNWhG;
                if (wheelView2 == null) {
                }
                calendar.set(11, wheelView2.getCurrentItem());
                wheelView3 = this.fARcdN;
                if (wheelView3 == null) {
                }
                calendar.set(12, wheelView3.getCurrentItem());
                wheelView4 = this.ejfBZ;
                if (wheelView4 == null) {
                }
                calendar.set(13, wheelView6.getCurrentItem());
                calendar.set(14, 0);
                Date time2 = calendar.getTime();
                Intrinsics.checkNotNullExpressionValue(time2, "");
                return time2;
            }
            WheelView wheelView12 = this.AuCTel;
            if (wheelView12 == null) {
                Intrinsics.gEmmrt("");
                wheelView12 = null;
            }
            currentItem2 = wheelView12.getCurrentItem();
        }
        currentItem = currentItem2 + 1;
        z = false;
        wheelView = this.fIwbmz;
        if (wheelView == null) {
        }
        int[] iArrOLrzqt22 = C5322Ng.OLrzqt(currentItem3, currentItem, wheelView.getCurrentItem() + 1, z);
        calendar.set(1, iArrOLrzqt22[0]);
        calendar.set(2, iArrOLrzqt22[1]);
        calendar.set(5, iArrOLrzqt22[2]);
        wheelView2 = this.fJNWhG;
        if (wheelView2 == null) {
        }
        calendar.set(11, wheelView2.getCurrentItem());
        wheelView3 = this.fARcdN;
        if (wheelView3 == null) {
        }
        calendar.set(12, wheelView3.getCurrentItem());
        wheelView4 = this.ejfBZ;
        if (wheelView4 == null) {
        }
        calendar.set(13, wheelView6.getCurrentItem());
        calendar.set(14, 0);
        Date time22 = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time22, "");
        return time22;
    }

    public final void OLrzqt(Calendar calendar, Calendar calendar2) {
        if (calendar == null && calendar2 != null) {
            int i = calendar2.get(1);
            int i2 = calendar2.get(2) + 1;
            int i3 = calendar2.get(5);
            int i4 = this.DbNXlk;
            if (i <= i4) {
                if (i != i4) {
                    return;
                }
                int i5 = this.AhwBna;
                if (i2 <= i5 && (i2 != i5 || i3 <= this.valueOf)) {
                    return;
                }
            }
            this.AEQbTJ = i;
            this.KWHzl = i2;
            this.copydefault = i3;
            return;
        }
        if (calendar == null || calendar2 != null) {
            if (calendar == null || calendar2 == null) {
                return;
            }
            this.DbNXlk = calendar.get(1);
            this.AEQbTJ = calendar2.get(1);
            this.AhwBna = calendar.get(2) + 1;
            this.KWHzl = calendar2.get(2) + 1;
            this.valueOf = calendar.get(5);
            this.copydefault = calendar2.get(5);
            return;
        }
        int i6 = calendar.get(1);
        int i7 = calendar.get(2) + 1;
        int i8 = calendar.get(5);
        int i9 = this.AEQbTJ;
        if (i6 >= i9) {
            if (i6 != i9) {
                return;
            }
            int i10 = this.KWHzl;
            if (i7 >= i10 && (i7 != i10 || i8 >= this.copydefault)) {
                return;
            }
        }
        this.AhwBna = i7;
        this.valueOf = i8;
        this.DbNXlk = i6;
    }

    public final void copydefault(float f) {
        WheelView wheelView = this.fIwbmz;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setLineSpacingMultiplier(f);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setLineSpacingMultiplier(f);
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setLineSpacingMultiplier(f);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setLineSpacingMultiplier(f);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setLineSpacingMultiplier(f);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.setLineSpacingMultiplier(f);
    }

    public final float AEQbTJ() {
        WheelView wheelView = this.fIwbmz;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        return wheelView.getItemHeight();
    }

    public final void copydefault(int i) {
        WheelView wheelView = this.fIwbmz;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setDividerColor(i);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setDividerColor(i);
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setDividerColor(i);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setDividerColor(i);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setDividerColor(i);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.setDividerColor(i);
    }

    public final void copydefault(WheelView.DividerType dividerType) {
        WheelView wheelView = this.fIwbmz;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setDividerType(dividerType);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setDividerType(dividerType);
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setDividerType(dividerType);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setDividerType(dividerType);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setDividerType(dividerType);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.setDividerType(dividerType);
    }

    public final void KWHzl(int i) {
        WheelView wheelView = this.fIwbmz;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setTextColorCenter(i);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setTextColorCenter(i);
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setTextColorCenter(i);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setTextColorCenter(i);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setTextColorCenter(i);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.setTextColorCenter(i);
    }

    public final void AYXKKw(int i) {
        WheelView wheelView = this.fIwbmz;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setTextColorOut(i);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setTextColorOut(i);
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setTextColorOut(i);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setTextColorOut(i);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setTextColorOut(i);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.setTextColorOut(i);
    }

    public final void EZpvd(boolean z) {
        WheelView wheelView = this.fIwbmz;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.isCenterLabel(z);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.isCenterLabel(z);
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.isCenterLabel(z);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.isCenterLabel(z);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.isCenterLabel(z);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.isCenterLabel(z);
    }

    public final void OLrzqt(@NotNull android.graphics.Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "");
        WheelView wheelView = this.fIwbmz;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setTypeface(typeface);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setTypeface(typeface);
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setTypeface(typeface);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setTypeface(typeface);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setTypeface(typeface);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.setTypeface(typeface);
    }

    public final void EZpvd(int i) {
        WheelView wheelView = this.fIwbmz;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setItemsVisibleCount(i);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setItemsVisibleCount(i);
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setItemsVisibleCount(i);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setItemsVisibleCount(i);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setItemsVisibleCount(i);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.setItemsVisibleCount(i);
    }

    public final void KWHzl(boolean z) {
        WheelView wheelView = this.fIwbmz;
        WheelView wheelView2 = null;
        if (wheelView == null) {
            Intrinsics.gEmmrt("");
            wheelView = null;
        }
        wheelView.setAlphaGradient(z);
        WheelView wheelView3 = this.AuCTel;
        if (wheelView3 == null) {
            Intrinsics.gEmmrt("");
            wheelView3 = null;
        }
        wheelView3.setAlphaGradient(z);
        WheelView wheelView4 = this.hDKMBd;
        if (wheelView4 == null) {
            Intrinsics.gEmmrt("");
            wheelView4 = null;
        }
        wheelView4.setAlphaGradient(z);
        WheelView wheelView5 = this.fJNWhG;
        if (wheelView5 == null) {
            Intrinsics.gEmmrt("");
            wheelView5 = null;
        }
        wheelView5.setAlphaGradient(z);
        WheelView wheelView6 = this.fARcdN;
        if (wheelView6 == null) {
            Intrinsics.gEmmrt("");
            wheelView6 = null;
        }
        wheelView6.setAlphaGradient(z);
        WheelView wheelView7 = this.ejfBZ;
        if (wheelView7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wheelView2 = wheelView7;
        }
        wheelView2.setAlphaGradient(z);
    }

    /* JADX INFO: renamed from: o.axJ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.axJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
