package o;

import com.contrarywind.listener.OnItemSelectedListener;
import com.contrarywind.view.WheelView;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import o.MW;

/* JADX INFO: renamed from: o.Nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5327Nl {
    public static java.text.DateFormat KWHzl = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public InterfaceC5317Nb AYXKKw;
    public android.view.View AkhnZx;
    public WheelView AuCTel;
    public boolean[] DbNXlk;
    public int copydefault;
    public WheelView ejfBZ;
    public WheelView fARcdN;
    public WheelView fIwbmz;
    public WheelView fJNWhG;
    public int fetchVPNInfo;
    public WheelView isConnected;
    public int valueOf;
    public int values = 1900;
    public int OLrzqt = 2100;
    public int AhwBna = 1;
    public int EZpvd = 12;
    public int djBIcL = 1;
    public int AEQbTJ = 31;
    public boolean gEmmrt = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(InterfaceC5317Nb interfaceC5317Nb) {
        this.AYXKKw = interfaceC5317Nb;
    }

    public C5327Nl(android.view.View view, boolean[] zArr, int i, int i2) {
        this.AkhnZx = view;
        this.DbNXlk = zArr;
        this.valueOf = i;
        this.fetchVPNInfo = i2;
    }

    public void EZpvd(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.gEmmrt) {
            int[] iArrCopydefault = C5322Ng.copydefault(i, i2 + 1, i3);
            EZpvd(iArrCopydefault[0], iArrCopydefault[1] - 1, iArrCopydefault[2], iArrCopydefault[3] == 1, i4, i5, i6);
            return;
        }
        KWHzl(i, i2, i3, i4, i5, i6);
    }

    public final void EZpvd(int i, int i2, int i3, boolean z, int i4, int i5, int i6) {
        WheelView wheelView = (WheelView) this.AkhnZx.findViewById(MW.Activity.isConnected);
        this.AuCTel = wheelView;
        wheelView.setAdapter(new MT(C5320Ne.KWHzl(this.values, this.OLrzqt)));
        this.AuCTel.setLabel("");
        this.AuCTel.setCurrentItem(i - this.values);
        this.AuCTel.setGravity(this.valueOf);
        WheelView wheelView2 = (WheelView) this.AkhnZx.findViewById(MW.Activity.gEmmrt);
        this.fJNWhG = wheelView2;
        wheelView2.setAdapter(new MT(C5320Ne.KWHzl(i)));
        this.fJNWhG.setLabel("");
        int iAYXKKw = C5320Ne.AYXKKw(i);
        if (iAYXKKw != 0 && (i2 > iAYXKKw - 1 || z)) {
            this.fJNWhG.setCurrentItem(i2 + 1);
        } else {
            this.fJNWhG.setCurrentItem(i2);
        }
        this.fJNWhG.setGravity(this.valueOf);
        this.isConnected = (WheelView) this.AkhnZx.findViewById(MW.Activity.OLrzqt);
        if (C5320Ne.AYXKKw(i) == 0) {
            this.isConnected.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(i, i2))));
        } else {
            this.isConnected.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(i))));
        }
        this.isConnected.setLabel("");
        this.isConnected.setCurrentItem(i3 - 1);
        this.isConnected.setGravity(this.valueOf);
        WheelView wheelView3 = (WheelView) this.AkhnZx.findViewById(MW.Activity.KWHzl);
        this.fARcdN = wheelView3;
        wheelView3.setAdapter(new MU(0, 23));
        this.fARcdN.setCurrentItem(i4);
        this.fARcdN.setGravity(this.valueOf);
        WheelView wheelView4 = (WheelView) this.AkhnZx.findViewById(MW.Activity.valueOf);
        this.ejfBZ = wheelView4;
        wheelView4.setAdapter(new MU(0, 59));
        this.ejfBZ.setCurrentItem(i5);
        this.ejfBZ.setGravity(this.valueOf);
        WheelView wheelView5 = (WheelView) this.AkhnZx.findViewById(MW.Activity.djBIcL);
        this.fIwbmz = wheelView5;
        wheelView5.setAdapter(new MU(0, 59));
        this.fIwbmz.setCurrentItem(i5);
        this.fIwbmz.setGravity(this.valueOf);
        this.AuCTel.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: o.Nl.1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int i7) {
                int iCopydefault;
                int i8 = i7 + C5327Nl.this.values;
                C5327Nl.this.fJNWhG.setAdapter(new MT(C5320Ne.KWHzl(i8)));
                if (C5320Ne.AYXKKw(i8) == 0 || C5327Nl.this.fJNWhG.getCurrentItem() <= C5320Ne.AYXKKw(i8) - 1) {
                    C5327Nl.this.fJNWhG.setCurrentItem(C5327Nl.this.fJNWhG.getCurrentItem());
                } else {
                    C5327Nl.this.fJNWhG.setCurrentItem(C5327Nl.this.fJNWhG.getCurrentItem() + 1);
                }
                int currentItem = C5327Nl.this.isConnected.getCurrentItem();
                if (C5320Ne.AYXKKw(i8) == 0 || C5327Nl.this.fJNWhG.getCurrentItem() <= C5320Ne.AYXKKw(i8) - 1) {
                    C5327Nl.this.isConnected.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(i8, C5327Nl.this.fJNWhG.getCurrentItem() + 1))));
                    iCopydefault = C5320Ne.copydefault(i8, C5327Nl.this.fJNWhG.getCurrentItem() + 1);
                } else if (C5327Nl.this.fJNWhG.getCurrentItem() == C5320Ne.AYXKKw(i8) + 1) {
                    C5327Nl.this.isConnected.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(i8))));
                    iCopydefault = C5320Ne.copydefault(i8);
                } else {
                    C5327Nl.this.isConnected.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(i8, C5327Nl.this.fJNWhG.getCurrentItem()))));
                    iCopydefault = C5320Ne.copydefault(i8, C5327Nl.this.fJNWhG.getCurrentItem());
                }
                int i9 = iCopydefault - 1;
                if (currentItem > i9) {
                    C5327Nl.this.isConnected.setCurrentItem(i9);
                }
                if (C5327Nl.this.AYXKKw != null) {
                    C5327Nl.this.AYXKKw.AEQbTJ();
                }
            }
        });
        this.fJNWhG.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: o.Nl.3
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int i7) {
                int iCopydefault;
                int currentItem = C5327Nl.this.AuCTel.getCurrentItem() + C5327Nl.this.values;
                int currentItem2 = C5327Nl.this.isConnected.getCurrentItem();
                if (C5320Ne.AYXKKw(currentItem) == 0 || i7 <= C5320Ne.AYXKKw(currentItem) - 1) {
                    int i8 = i7 + 1;
                    C5327Nl.this.isConnected.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(currentItem, i8))));
                    iCopydefault = C5320Ne.copydefault(currentItem, i8);
                } else if (C5327Nl.this.fJNWhG.getCurrentItem() == C5320Ne.AYXKKw(currentItem) + 1) {
                    C5327Nl.this.isConnected.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(currentItem))));
                    iCopydefault = C5320Ne.copydefault(currentItem);
                } else {
                    C5327Nl.this.isConnected.setAdapter(new MT(C5320Ne.AEQbTJ(C5320Ne.copydefault(currentItem, i7))));
                    iCopydefault = C5320Ne.copydefault(currentItem, i7);
                }
                int i9 = iCopydefault - 1;
                if (currentItem2 > i9) {
                    C5327Nl.this.isConnected.setCurrentItem(i9);
                }
                if (C5327Nl.this.AYXKKw != null) {
                    C5327Nl.this.AYXKKw.AEQbTJ();
                }
            }
        });
        OLrzqt(this.isConnected);
        OLrzqt(this.fARcdN);
        OLrzqt(this.ejfBZ);
        OLrzqt(this.fIwbmz);
        boolean[] zArr = this.DbNXlk;
        if (zArr.length != 6) {
            throw new java.lang.RuntimeException("type[] length is not 6");
        }
        this.AuCTel.setVisibility(zArr[0] ? 0 : 8);
        this.fJNWhG.setVisibility(this.DbNXlk[1] ? 0 : 8);
        this.isConnected.setVisibility(this.DbNXlk[2] ? 0 : 8);
        this.fARcdN.setVisibility(this.DbNXlk[3] ? 0 : 8);
        this.ejfBZ.setVisibility(this.DbNXlk[4] ? 0 : 8);
        this.fIwbmz.setVisibility(this.DbNXlk[5] ? 0 : 8);
        OLrzqt();
    }

    public final void KWHzl(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        java.lang.String[] strArr = {"4", OrderDetailListItem.SLIP_OUT, "9", "11"};
        final java.util.List listAsList = java.util.Arrays.asList("1", "3", "5", "7", "8", "10", "12");
        final java.util.List listAsList2 = java.util.Arrays.asList(strArr);
        this.copydefault = i;
        WheelView wheelView = (WheelView) this.AkhnZx.findViewById(MW.Activity.isConnected);
        this.AuCTel = wheelView;
        wheelView.setAdapter(new MU(this.values, this.OLrzqt));
        this.AuCTel.setCurrentItem(i - this.values);
        this.AuCTel.setGravity(this.valueOf);
        WheelView wheelView2 = (WheelView) this.AkhnZx.findViewById(MW.Activity.gEmmrt);
        this.fJNWhG = wheelView2;
        int i9 = this.values;
        int i10 = this.OLrzqt;
        if (i9 == i10) {
            wheelView2.setAdapter(new MU(this.AhwBna, this.EZpvd));
            this.fJNWhG.setCurrentItem((i2 + 1) - this.AhwBna);
        } else if (i == i9) {
            wheelView2.setAdapter(new MU(this.AhwBna, 12));
            this.fJNWhG.setCurrentItem((i2 + 1) - this.AhwBna);
        } else if (i == i10) {
            wheelView2.setAdapter(new MU(1, this.EZpvd));
            this.fJNWhG.setCurrentItem(i2);
        } else {
            wheelView2.setAdapter(new MU(1, 12));
            this.fJNWhG.setCurrentItem(i2);
        }
        this.fJNWhG.setGravity(this.valueOf);
        this.isConnected = (WheelView) this.AkhnZx.findViewById(MW.Activity.OLrzqt);
        boolean z = (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
        int i11 = this.values;
        int i12 = this.OLrzqt;
        if (i11 == i12 && this.AhwBna == this.EZpvd) {
            int i13 = i2 + 1;
            if (listAsList.contains(java.lang.String.valueOf(i13))) {
                if (this.AEQbTJ > 31) {
                    this.AEQbTJ = 31;
                }
                this.isConnected.setAdapter(new MU(this.djBIcL, this.AEQbTJ));
            } else if (listAsList2.contains(java.lang.String.valueOf(i13))) {
                if (this.AEQbTJ > 30) {
                    this.AEQbTJ = 30;
                }
                this.isConnected.setAdapter(new MU(this.djBIcL, this.AEQbTJ));
            } else if (z) {
                if (this.AEQbTJ > 29) {
                    this.AEQbTJ = 29;
                }
                this.isConnected.setAdapter(new MU(this.djBIcL, this.AEQbTJ));
            } else {
                if (this.AEQbTJ > 28) {
                    this.AEQbTJ = 28;
                }
                this.isConnected.setAdapter(new MU(this.djBIcL, this.AEQbTJ));
            }
            this.isConnected.setCurrentItem(i3 - this.djBIcL);
        } else if (i == i11 && (i8 = i2 + 1) == this.AhwBna) {
            if (listAsList.contains(java.lang.String.valueOf(i8))) {
                this.isConnected.setAdapter(new MU(this.djBIcL, 31));
            } else if (listAsList2.contains(java.lang.String.valueOf(i8))) {
                this.isConnected.setAdapter(new MU(this.djBIcL, 30));
            } else {
                this.isConnected.setAdapter(new MU(this.djBIcL, z ? 29 : 28));
            }
            this.isConnected.setCurrentItem(i3 - this.djBIcL);
        } else if (i == i12 && (i7 = i2 + 1) == this.EZpvd) {
            if (listAsList.contains(java.lang.String.valueOf(i7))) {
                if (this.AEQbTJ > 31) {
                    this.AEQbTJ = 31;
                }
                this.isConnected.setAdapter(new MU(1, this.AEQbTJ));
            } else if (listAsList2.contains(java.lang.String.valueOf(i7))) {
                if (this.AEQbTJ > 30) {
                    this.AEQbTJ = 30;
                }
                this.isConnected.setAdapter(new MU(1, this.AEQbTJ));
            } else if (z) {
                if (this.AEQbTJ > 29) {
                    this.AEQbTJ = 29;
                }
                this.isConnected.setAdapter(new MU(1, this.AEQbTJ));
            } else {
                if (this.AEQbTJ > 28) {
                    this.AEQbTJ = 28;
                }
                this.isConnected.setAdapter(new MU(1, this.AEQbTJ));
            }
            this.isConnected.setCurrentItem(i3 - 1);
        } else {
            int i14 = i2 + 1;
            if (listAsList.contains(java.lang.String.valueOf(i14))) {
                this.isConnected.setAdapter(new MU(1, 31));
            } else if (listAsList2.contains(java.lang.String.valueOf(i14))) {
                this.isConnected.setAdapter(new MU(1, 30));
            } else {
                this.isConnected.setAdapter(new MU(1, z ? 29 : 28));
            }
            this.isConnected.setCurrentItem(i3 - 1);
        }
        this.isConnected.setGravity(this.valueOf);
        WheelView wheelView3 = (WheelView) this.AkhnZx.findViewById(MW.Activity.KWHzl);
        this.fARcdN = wheelView3;
        wheelView3.setAdapter(new MU(0, 23));
        this.fARcdN.setCurrentItem(i4);
        this.fARcdN.setGravity(this.valueOf);
        WheelView wheelView4 = (WheelView) this.AkhnZx.findViewById(MW.Activity.valueOf);
        this.ejfBZ = wheelView4;
        wheelView4.setAdapter(new MU(0, 59));
        this.ejfBZ.setCurrentItem(i5);
        this.ejfBZ.setGravity(this.valueOf);
        WheelView wheelView5 = (WheelView) this.AkhnZx.findViewById(MW.Activity.djBIcL);
        this.fIwbmz = wheelView5;
        wheelView5.setAdapter(new MU(0, 59));
        this.fIwbmz.setCurrentItem(i6);
        this.fIwbmz.setGravity(this.valueOf);
        this.AuCTel.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: o.Nl.5
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int i15) {
                int i16 = i15 + C5327Nl.this.values;
                C5327Nl.this.copydefault = i16;
                int currentItem = C5327Nl.this.fJNWhG.getCurrentItem();
                if (C5327Nl.this.values == C5327Nl.this.OLrzqt) {
                    C5327Nl.this.fJNWhG.setAdapter(new MU(C5327Nl.this.AhwBna, C5327Nl.this.EZpvd));
                    if (currentItem > C5327Nl.this.fJNWhG.getAdapter().getItemsCount() - 1) {
                        currentItem = C5327Nl.this.fJNWhG.getAdapter().getItemsCount() - 1;
                        C5327Nl.this.fJNWhG.setCurrentItem(currentItem);
                    }
                    int i17 = currentItem + C5327Nl.this.AhwBna;
                    if (C5327Nl.this.AhwBna == C5327Nl.this.EZpvd) {
                        C5327Nl c5327Nl = C5327Nl.this;
                        c5327Nl.OLrzqt(i16, i17, c5327Nl.djBIcL, C5327Nl.this.AEQbTJ, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    } else if (i17 == C5327Nl.this.AhwBna) {
                        C5327Nl c5327Nl2 = C5327Nl.this;
                        c5327Nl2.OLrzqt(i16, i17, c5327Nl2.djBIcL, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    } else if (i17 == C5327Nl.this.EZpvd) {
                        C5327Nl c5327Nl3 = C5327Nl.this;
                        c5327Nl3.OLrzqt(i16, i17, 1, c5327Nl3.AEQbTJ, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    } else {
                        C5327Nl.this.OLrzqt(i16, i17, 1, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    }
                } else if (i16 == C5327Nl.this.values) {
                    C5327Nl.this.fJNWhG.setAdapter(new MU(C5327Nl.this.AhwBna, 12));
                    if (currentItem > C5327Nl.this.fJNWhG.getAdapter().getItemsCount() - 1) {
                        currentItem = C5327Nl.this.fJNWhG.getAdapter().getItemsCount() - 1;
                        C5327Nl.this.fJNWhG.setCurrentItem(currentItem);
                    }
                    int i18 = currentItem + C5327Nl.this.AhwBna;
                    if (i18 == C5327Nl.this.AhwBna) {
                        C5327Nl c5327Nl4 = C5327Nl.this;
                        c5327Nl4.OLrzqt(i16, i18, c5327Nl4.djBIcL, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    } else {
                        C5327Nl.this.OLrzqt(i16, i18, 1, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    }
                } else if (i16 == C5327Nl.this.OLrzqt) {
                    C5327Nl.this.fJNWhG.setAdapter(new MU(1, C5327Nl.this.EZpvd));
                    if (currentItem > C5327Nl.this.fJNWhG.getAdapter().getItemsCount() - 1) {
                        currentItem = C5327Nl.this.fJNWhG.getAdapter().getItemsCount() - 1;
                        C5327Nl.this.fJNWhG.setCurrentItem(currentItem);
                    }
                    int i19 = 1 + currentItem;
                    if (i19 == C5327Nl.this.EZpvd) {
                        C5327Nl c5327Nl5 = C5327Nl.this;
                        c5327Nl5.OLrzqt(i16, i19, 1, c5327Nl5.AEQbTJ, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    } else {
                        C5327Nl.this.OLrzqt(i16, i19, 1, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    }
                } else {
                    C5327Nl.this.fJNWhG.setAdapter(new MU(1, 12));
                    C5327Nl c5327Nl6 = C5327Nl.this;
                    c5327Nl6.OLrzqt(i16, 1 + c5327Nl6.fJNWhG.getCurrentItem(), 1, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                }
                if (C5327Nl.this.AYXKKw != null) {
                    C5327Nl.this.AYXKKw.AEQbTJ();
                }
            }
        });
        this.fJNWhG.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: o.Nl.4
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int i15) {
                int i16 = i15 + 1;
                if (C5327Nl.this.values == C5327Nl.this.OLrzqt) {
                    int i17 = (i16 + C5327Nl.this.AhwBna) - 1;
                    if (C5327Nl.this.AhwBna == C5327Nl.this.EZpvd) {
                        C5327Nl c5327Nl = C5327Nl.this;
                        c5327Nl.OLrzqt(c5327Nl.copydefault, i17, C5327Nl.this.djBIcL, C5327Nl.this.AEQbTJ, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    } else if (C5327Nl.this.AhwBna == i17) {
                        C5327Nl c5327Nl2 = C5327Nl.this;
                        c5327Nl2.OLrzqt(c5327Nl2.copydefault, i17, C5327Nl.this.djBIcL, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    } else if (C5327Nl.this.EZpvd == i17) {
                        C5327Nl c5327Nl3 = C5327Nl.this;
                        c5327Nl3.OLrzqt(c5327Nl3.copydefault, i17, 1, C5327Nl.this.AEQbTJ, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    } else {
                        C5327Nl c5327Nl4 = C5327Nl.this;
                        c5327Nl4.OLrzqt(c5327Nl4.copydefault, i17, 1, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    }
                } else if (C5327Nl.this.copydefault == C5327Nl.this.values) {
                    int i18 = (i16 + C5327Nl.this.AhwBna) - 1;
                    if (i18 == C5327Nl.this.AhwBna) {
                        C5327Nl c5327Nl5 = C5327Nl.this;
                        c5327Nl5.OLrzqt(c5327Nl5.copydefault, i18, C5327Nl.this.djBIcL, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    } else {
                        C5327Nl c5327Nl6 = C5327Nl.this;
                        c5327Nl6.OLrzqt(c5327Nl6.copydefault, i18, 1, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    }
                } else if (C5327Nl.this.copydefault == C5327Nl.this.OLrzqt) {
                    if (i16 == C5327Nl.this.EZpvd) {
                        C5327Nl c5327Nl7 = C5327Nl.this;
                        c5327Nl7.OLrzqt(c5327Nl7.copydefault, C5327Nl.this.fJNWhG.getCurrentItem() + 1, 1, C5327Nl.this.AEQbTJ, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    } else {
                        C5327Nl c5327Nl8 = C5327Nl.this;
                        c5327Nl8.OLrzqt(c5327Nl8.copydefault, C5327Nl.this.fJNWhG.getCurrentItem() + 1, 1, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                    }
                } else {
                    C5327Nl c5327Nl9 = C5327Nl.this;
                    c5327Nl9.OLrzqt(c5327Nl9.copydefault, i16, 1, 31, (java.util.List<java.lang.String>) listAsList, (java.util.List<java.lang.String>) listAsList2);
                }
                if (C5327Nl.this.AYXKKw != null) {
                    C5327Nl.this.AYXKKw.AEQbTJ();
                }
            }
        });
        OLrzqt(this.isConnected);
        OLrzqt(this.fARcdN);
        OLrzqt(this.ejfBZ);
        OLrzqt(this.fIwbmz);
        boolean[] zArr = this.DbNXlk;
        if (zArr.length != 6) {
            throw new java.lang.IllegalArgumentException("type[] length is not 6");
        }
        this.AuCTel.setVisibility(zArr[0] ? 0 : 8);
        this.fJNWhG.setVisibility(this.DbNXlk[1] ? 0 : 8);
        this.isConnected.setVisibility(this.DbNXlk[2] ? 0 : 8);
        this.fARcdN.setVisibility(this.DbNXlk[3] ? 0 : 8);
        this.ejfBZ.setVisibility(this.DbNXlk[4] ? 0 : 8);
        this.fIwbmz.setVisibility(this.DbNXlk[5] ? 0 : 8);
        OLrzqt();
    }

    public final void OLrzqt(WheelView wheelView) {
        if (this.AYXKKw != null) {
            wheelView.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: o.Nl.2
                @Override // com.contrarywind.listener.OnItemSelectedListener
                public void onItemSelected(int i) {
                    C5327Nl.this.AYXKKw.AEQbTJ();
                }
            });
        }
    }

    public final void OLrzqt(int i, int i2, int i3, int i4, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        int currentItem = this.isConnected.getCurrentItem();
        if (list.contains(java.lang.String.valueOf(i2))) {
            if (i4 > 31) {
                i4 = 31;
            }
            this.isConnected.setAdapter(new MU(i3, i4));
        } else if (list2.contains(java.lang.String.valueOf(i2))) {
            if (i4 > 30) {
                i4 = 30;
            }
            this.isConnected.setAdapter(new MU(i3, i4));
        } else if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            if (i4 > 29) {
                i4 = 29;
            }
            this.isConnected.setAdapter(new MU(i3, i4));
        } else {
            if (i4 > 28) {
                i4 = 28;
            }
            this.isConnected.setAdapter(new MU(i3, i4));
        }
        if (currentItem > this.isConnected.getAdapter().getItemsCount() - 1) {
            this.isConnected.setCurrentItem(this.isConnected.getAdapter().getItemsCount() - 1);
        }
    }

    public final void OLrzqt() {
        this.isConnected.setTextSize(this.fetchVPNInfo);
        this.fJNWhG.setTextSize(this.fetchVPNInfo);
        this.AuCTel.setTextSize(this.fetchVPNInfo);
        this.fARcdN.setTextSize(this.fetchVPNInfo);
        this.ejfBZ.setTextSize(this.fetchVPNInfo);
        this.fIwbmz.setTextSize(this.fetchVPNInfo);
    }

    public void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (this.gEmmrt) {
            return;
        }
        if (str != null) {
            this.AuCTel.setLabel(str);
        } else {
            this.AuCTel.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.gEmmrt));
        }
        if (str2 != null) {
            this.fJNWhG.setLabel(str2);
        } else {
            this.fJNWhG.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.OLrzqt));
        }
        if (str3 != null) {
            this.isConnected.setLabel(str3);
        } else {
            this.isConnected.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.KWHzl));
        }
        if (str4 != null) {
            this.fARcdN.setLabel(str4);
        } else {
            this.fARcdN.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.AEQbTJ));
        }
        if (str5 != null) {
            this.ejfBZ.setLabel(str5);
        } else {
            this.ejfBZ.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.copydefault));
        }
        if (str6 != null) {
            this.fIwbmz.setLabel(str6);
        } else {
            this.fIwbmz.setLabel(this.AkhnZx.getContext().getString(MW.ActionBar.AYXKKw));
        }
    }

    public void copydefault(int i, int i2, int i3, int i4, int i5, int i6) {
        this.AuCTel.setTextXOffset(i);
        this.fJNWhG.setTextXOffset(i2);
        this.isConnected.setTextXOffset(i3);
        this.fARcdN.setTextXOffset(i4);
        this.ejfBZ.setTextXOffset(i5);
        this.fIwbmz.setTextXOffset(i6);
    }

    public void AEQbTJ(boolean z) {
        this.AuCTel.setCyclic(z);
        this.fJNWhG.setCyclic(z);
        this.isConnected.setCyclic(z);
        this.fARcdN.setCyclic(z);
        this.ejfBZ.setCyclic(z);
        this.fIwbmz.setCyclic(z);
    }

    public java.lang.String KWHzl() {
        if (this.gEmmrt) {
            return copydefault();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.copydefault == this.values) {
            int currentItem = this.fJNWhG.getCurrentItem();
            int i = this.AhwBna;
            if (currentItem + i == i) {
                sb.append(this.AuCTel.getCurrentItem() + this.values);
                sb.append("-");
                sb.append(this.fJNWhG.getCurrentItem() + this.AhwBna);
                sb.append("-");
                sb.append(this.isConnected.getCurrentItem() + this.djBIcL);
                sb.append(" ");
                sb.append(this.fARcdN.getCurrentItem());
                sb.append(":");
                sb.append(this.ejfBZ.getCurrentItem());
                sb.append(":");
                sb.append(this.fIwbmz.getCurrentItem());
            } else {
                sb.append(this.AuCTel.getCurrentItem() + this.values);
                sb.append("-");
                sb.append(this.fJNWhG.getCurrentItem() + this.AhwBna);
                sb.append("-");
                sb.append(this.isConnected.getCurrentItem() + 1);
                sb.append(" ");
                sb.append(this.fARcdN.getCurrentItem());
                sb.append(":");
                sb.append(this.ejfBZ.getCurrentItem());
                sb.append(":");
                sb.append(this.fIwbmz.getCurrentItem());
            }
        } else {
            sb.append(this.AuCTel.getCurrentItem() + this.values);
            sb.append("-");
            sb.append(this.fJNWhG.getCurrentItem() + 1);
            sb.append("-");
            sb.append(this.isConnected.getCurrentItem() + 1);
            sb.append(" ");
            sb.append(this.fARcdN.getCurrentItem());
            sb.append(":");
            sb.append(this.ejfBZ.getCurrentItem());
            sb.append(":");
            sb.append(this.fIwbmz.getCurrentItem());
        }
        return sb.toString();
    }

    public final java.lang.String copydefault() {
        int currentItem;
        boolean z;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int currentItem2 = this.AuCTel.getCurrentItem() + this.values;
        if (C5320Ne.AYXKKw(currentItem2) == 0 || (this.fJNWhG.getCurrentItem() + 1) - C5320Ne.AYXKKw(currentItem2) <= 0) {
            int currentItem3 = this.fJNWhG.getCurrentItem();
            currentItem = currentItem3 + 1;
            z = false;
            int[] iArrOLrzqt = C5322Ng.OLrzqt(currentItem2, currentItem, this.isConnected.getCurrentItem() + 1, z);
            sb.append(iArrOLrzqt[0]);
            sb.append("-");
            sb.append(iArrOLrzqt[1]);
            sb.append("-");
            sb.append(iArrOLrzqt[2]);
            sb.append(" ");
            sb.append(this.fARcdN.getCurrentItem());
            sb.append(":");
            sb.append(this.ejfBZ.getCurrentItem());
            sb.append(":");
            sb.append(this.fIwbmz.getCurrentItem());
            return sb.toString();
        }
        if ((this.fJNWhG.getCurrentItem() + 1) - C5320Ne.AYXKKw(currentItem2) == 1) {
            currentItem = this.fJNWhG.getCurrentItem();
            z = true;
            int[] iArrOLrzqt2 = C5322Ng.OLrzqt(currentItem2, currentItem, this.isConnected.getCurrentItem() + 1, z);
            sb.append(iArrOLrzqt2[0]);
            sb.append("-");
            sb.append(iArrOLrzqt2[1]);
            sb.append("-");
            sb.append(iArrOLrzqt2[2]);
            sb.append(" ");
            sb.append(this.fARcdN.getCurrentItem());
            sb.append(":");
            sb.append(this.ejfBZ.getCurrentItem());
            sb.append(":");
            sb.append(this.fIwbmz.getCurrentItem());
            return sb.toString();
        }
        currentItem = this.fJNWhG.getCurrentItem();
        z = false;
        int[] iArrOLrzqt22 = C5322Ng.OLrzqt(currentItem2, currentItem, this.isConnected.getCurrentItem() + 1, z);
        sb.append(iArrOLrzqt22[0]);
        sb.append("-");
        sb.append(iArrOLrzqt22[1]);
        sb.append("-");
        sb.append(iArrOLrzqt22[2]);
        sb.append(" ");
        sb.append(this.fARcdN.getCurrentItem());
        sb.append(":");
        sb.append(this.ejfBZ.getCurrentItem());
        sb.append(":");
        sb.append(this.fIwbmz.getCurrentItem());
        return sb.toString();
    }

    public void OLrzqt(Calendar calendar, Calendar calendar2) {
        if (calendar == null && calendar2 != null) {
            int i = calendar2.get(1);
            int i2 = calendar2.get(2) + 1;
            int i3 = calendar2.get(5);
            int i4 = this.values;
            if (i <= i4) {
                if (i != i4) {
                    return;
                }
                int i5 = this.AhwBna;
                if (i2 <= i5 && (i2 != i5 || i3 <= this.djBIcL)) {
                    return;
                }
            }
            this.OLrzqt = i;
            this.EZpvd = i2;
            this.AEQbTJ = i3;
            return;
        }
        if (calendar == null || calendar2 != null) {
            if (calendar == null || calendar2 == null) {
                return;
            }
            this.values = calendar.get(1);
            this.OLrzqt = calendar2.get(1);
            this.AhwBna = calendar.get(2) + 1;
            this.EZpvd = calendar2.get(2) + 1;
            this.djBIcL = calendar.get(5);
            this.AEQbTJ = calendar2.get(5);
            return;
        }
        int i6 = calendar.get(1);
        int i7 = calendar.get(2) + 1;
        int i8 = calendar.get(5);
        int i9 = this.OLrzqt;
        if (i6 >= i9) {
            if (i6 != i9) {
                return;
            }
            int i10 = this.EZpvd;
            if (i7 >= i10 && (i7 != i10 || i8 >= this.AEQbTJ)) {
                return;
            }
        }
        this.AhwBna = i7;
        this.djBIcL = i8;
        this.values = i6;
    }

    public void OLrzqt(float f) {
        this.isConnected.setLineSpacingMultiplier(f);
        this.fJNWhG.setLineSpacingMultiplier(f);
        this.AuCTel.setLineSpacingMultiplier(f);
        this.fARcdN.setLineSpacingMultiplier(f);
        this.ejfBZ.setLineSpacingMultiplier(f);
        this.fIwbmz.setLineSpacingMultiplier(f);
    }

    public void EZpvd(int i) {
        this.isConnected.setDividerColor(i);
        this.fJNWhG.setDividerColor(i);
        this.AuCTel.setDividerColor(i);
        this.fARcdN.setDividerColor(i);
        this.ejfBZ.setDividerColor(i);
        this.fIwbmz.setDividerColor(i);
    }

    public void copydefault(WheelView.DividerType dividerType) {
        this.isConnected.setDividerType(dividerType);
        this.fJNWhG.setDividerType(dividerType);
        this.AuCTel.setDividerType(dividerType);
        this.fARcdN.setDividerType(dividerType);
        this.ejfBZ.setDividerType(dividerType);
        this.fIwbmz.setDividerType(dividerType);
    }

    public void AEQbTJ(int i) {
        this.isConnected.setTextColorCenter(i);
        this.fJNWhG.setTextColorCenter(i);
        this.AuCTel.setTextColorCenter(i);
        this.fARcdN.setTextColorCenter(i);
        this.ejfBZ.setTextColorCenter(i);
        this.fIwbmz.setTextColorCenter(i);
    }

    public void AYXKKw(int i) {
        this.isConnected.setTextColorOut(i);
        this.fJNWhG.setTextColorOut(i);
        this.AuCTel.setTextColorOut(i);
        this.fARcdN.setTextColorOut(i);
        this.ejfBZ.setTextColorOut(i);
        this.fIwbmz.setTextColorOut(i);
    }

    public void OLrzqt(boolean z) {
        this.isConnected.isCenterLabel(z);
        this.fJNWhG.isCenterLabel(z);
        this.AuCTel.isCenterLabel(z);
        this.fARcdN.isCenterLabel(z);
        this.ejfBZ.isCenterLabel(z);
        this.fIwbmz.isCenterLabel(z);
    }

    public void copydefault(int i) {
        this.isConnected.setItemsVisibleCount(i);
        this.fJNWhG.setItemsVisibleCount(i);
        this.AuCTel.setItemsVisibleCount(i);
        this.fARcdN.setItemsVisibleCount(i);
        this.ejfBZ.setItemsVisibleCount(i);
        this.fIwbmz.setItemsVisibleCount(i);
    }

    public void copydefault(boolean z) {
        this.isConnected.setAlphaGradient(z);
        this.fJNWhG.setAlphaGradient(z);
        this.AuCTel.setAlphaGradient(z);
        this.fARcdN.setAlphaGradient(z);
        this.ejfBZ.setAlphaGradient(z);
        this.fIwbmz.setAlphaGradient(z);
    }
}
