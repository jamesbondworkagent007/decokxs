package com.ibm.icu.text;

import o.C7189afD;
import o.C7190afE;
import o.C7223afl;
import o.C7242agD;

/* JADX INFO: loaded from: classes22.dex */
public class BidiTransform {
    public String AEQbTJ;
    public int EZpvd;
    public C7190afE KWHzl;
    public int copydefault;

    public enum Mirroring {
        OFF,
        ON
    }

    public enum Order {
        LOGICAL,
        VISUAL
    }

    public enum ReorderingScheme {
        LOG_LTR_TO_VIS_LTR { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.1
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.OLrzqt(b) && BidiTransform.OLrzqt(order) && BidiTransform.OLrzqt(b2) && BidiTransform.AEQbTJ(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.OLrzqt(0, 0);
                bidiTransform.AEQbTJ((byte) 0, 0);
                bidiTransform.OLrzqt();
            }
        },
        LOG_RTL_TO_VIS_LTR { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.2
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.KWHzl(b) && BidiTransform.OLrzqt(order) && BidiTransform.OLrzqt(b2) && BidiTransform.AEQbTJ(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.AEQbTJ((byte) 1, 0);
                bidiTransform.OLrzqt();
                bidiTransform.OLrzqt(0, 4);
            }
        },
        LOG_LTR_TO_VIS_RTL { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.3
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.OLrzqt(b) && BidiTransform.OLrzqt(order) && BidiTransform.KWHzl(b2) && BidiTransform.AEQbTJ(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.OLrzqt(0, 0);
                bidiTransform.AEQbTJ((byte) 0, 0);
                bidiTransform.OLrzqt();
                bidiTransform.EZpvd();
            }
        },
        LOG_RTL_TO_VIS_RTL { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.4
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.KWHzl(b) && BidiTransform.OLrzqt(order) && BidiTransform.KWHzl(b2) && BidiTransform.AEQbTJ(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.AEQbTJ((byte) 1, 0);
                bidiTransform.OLrzqt();
                bidiTransform.OLrzqt(0, 4);
                bidiTransform.EZpvd();
            }
        },
        VIS_LTR_TO_LOG_RTL { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.5
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.OLrzqt(b) && BidiTransform.AEQbTJ(order) && BidiTransform.KWHzl(b2) && BidiTransform.OLrzqt(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.OLrzqt(0, 4);
                bidiTransform.AEQbTJ((byte) 1, 5);
                bidiTransform.OLrzqt();
            }
        },
        VIS_RTL_TO_LOG_RTL { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.6
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.KWHzl(b) && BidiTransform.AEQbTJ(order) && BidiTransform.KWHzl(b2) && BidiTransform.OLrzqt(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.EZpvd();
                bidiTransform.OLrzqt(0, 4);
                bidiTransform.AEQbTJ((byte) 1, 5);
                bidiTransform.OLrzqt();
            }
        },
        VIS_LTR_TO_LOG_LTR { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.7
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.OLrzqt(b) && BidiTransform.AEQbTJ(order) && BidiTransform.OLrzqt(b2) && BidiTransform.OLrzqt(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.AEQbTJ((byte) 0, 5);
                bidiTransform.OLrzqt();
                bidiTransform.OLrzqt(0, 0);
            }
        },
        VIS_RTL_TO_LOG_LTR { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.8
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.KWHzl(b) && BidiTransform.AEQbTJ(order) && BidiTransform.OLrzqt(b2) && BidiTransform.OLrzqt(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.EZpvd();
                bidiTransform.AEQbTJ((byte) 0, 5);
                bidiTransform.OLrzqt();
                bidiTransform.OLrzqt(0, 0);
            }
        },
        LOG_LTR_TO_LOG_RTL { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.9
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.OLrzqt(b) && BidiTransform.OLrzqt(order) && BidiTransform.KWHzl(b2) && BidiTransform.OLrzqt(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.OLrzqt(0, 0);
                bidiTransform.AEQbTJ((byte) 0, 0);
                bidiTransform.AEQbTJ();
                bidiTransform.AEQbTJ((byte) 0, 3);
                bidiTransform.OLrzqt();
            }
        },
        LOG_RTL_TO_LOG_LTR { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.10
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.KWHzl(b) && BidiTransform.OLrzqt(order) && BidiTransform.OLrzqt(b2) && BidiTransform.OLrzqt(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.AEQbTJ((byte) 1, 0);
                bidiTransform.AEQbTJ();
                bidiTransform.AEQbTJ((byte) 1, 3);
                bidiTransform.OLrzqt();
                bidiTransform.OLrzqt(0, 0);
            }
        },
        VIS_LTR_TO_VIS_RTL { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.11
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.OLrzqt(b) && BidiTransform.AEQbTJ(order) && BidiTransform.KWHzl(b2) && BidiTransform.AEQbTJ(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.AEQbTJ((byte) 0, 0);
                bidiTransform.AEQbTJ();
                bidiTransform.OLrzqt(0, 4);
                bidiTransform.EZpvd();
            }
        },
        VIS_RTL_TO_VIS_LTR { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.12
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.KWHzl(b) && BidiTransform.AEQbTJ(order) && BidiTransform.OLrzqt(b2) && BidiTransform.AEQbTJ(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.EZpvd();
                bidiTransform.AEQbTJ((byte) 0, 0);
                bidiTransform.AEQbTJ();
                bidiTransform.OLrzqt(0, 4);
            }
        },
        LOG_LTR_TO_LOG_LTR { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.13
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.OLrzqt(b) && BidiTransform.OLrzqt(order) && BidiTransform.OLrzqt(b2) && BidiTransform.OLrzqt(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.AEQbTJ((byte) 0, 0);
                bidiTransform.AEQbTJ();
                bidiTransform.OLrzqt(0, 0);
            }
        },
        LOG_RTL_TO_LOG_RTL { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.14
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.KWHzl(b) && BidiTransform.OLrzqt(order) && BidiTransform.KWHzl(b2) && BidiTransform.OLrzqt(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.AEQbTJ((byte) 1, 0);
                bidiTransform.AEQbTJ();
                bidiTransform.OLrzqt(4, 0);
            }
        },
        VIS_LTR_TO_VIS_LTR { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.15
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.OLrzqt(b) && BidiTransform.AEQbTJ(order) && BidiTransform.OLrzqt(b2) && BidiTransform.AEQbTJ(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.AEQbTJ((byte) 0, 0);
                bidiTransform.AEQbTJ();
                bidiTransform.OLrzqt(0, 4);
            }
        },
        VIS_RTL_TO_VIS_RTL { // from class: com.ibm.icu.text.BidiTransform.ReorderingScheme.16
            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public boolean matches(byte b, Order order, byte b2, Order order2) {
                return BidiTransform.KWHzl(b) && BidiTransform.AEQbTJ(order) && BidiTransform.KWHzl(b2) && BidiTransform.AEQbTJ(order2);
            }

            @Override // com.ibm.icu.text.BidiTransform.ReorderingScheme
            public void doTransform(BidiTransform bidiTransform) {
                bidiTransform.EZpvd();
                bidiTransform.AEQbTJ((byte) 0, 0);
                bidiTransform.AEQbTJ();
                bidiTransform.OLrzqt(0, 4);
                bidiTransform.EZpvd();
            }
        };

        public abstract void doTransform(BidiTransform bidiTransform);

        public abstract boolean matches(byte b, Order order, byte b2, Order order2);
    }

    public static boolean KWHzl(byte b) {
        return (b & 1) == 1;
    }

    public static boolean OLrzqt(byte b) {
        return (b & 1) == 0;
    }

    public final void AEQbTJ(byte b, int i) {
        this.KWHzl.AEQbTJ((i & 5) != 0);
        this.KWHzl.fetchVPNInfo(i);
        this.KWHzl.AEQbTJ(this.AEQbTJ, b, null);
    }

    public final void OLrzqt() {
        this.AEQbTJ = this.KWHzl.AkhnZx(this.copydefault);
        this.copydefault = 0;
    }

    public final void EZpvd() {
        this.AEQbTJ = C7190afE.OLrzqt(this.AEQbTJ, 0);
    }

    public final void AEQbTJ() {
        if ((this.copydefault & 2) == 0) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(this.AEQbTJ);
        byte[] bArrAhwBna = this.KWHzl.AhwBna();
        int length = bArrAhwBna.length;
        int iCopydefault = 0;
        while (iCopydefault < length) {
            int iKWHzl = C7242agD.KWHzl(stringBuffer, iCopydefault);
            if ((bArrAhwBna[iCopydefault] & 1) != 0) {
                C7242agD.EZpvd(stringBuffer, iCopydefault, C7223afl.AhwBna(iKWHzl));
            }
            iCopydefault += C7242agD.copydefault(iKWHzl);
        }
        this.AEQbTJ = stringBuffer.toString();
        this.copydefault &= -3;
    }

    public final void OLrzqt(int i, int i2) {
        if (i == i2) {
            copydefault(i | this.EZpvd);
        } else {
            copydefault(i | (this.EZpvd & (-25)));
            copydefault((this.EZpvd & (-225)) | i2);
        }
    }

    public final void copydefault(int i) {
        if (i != 0) {
            try {
                this.AEQbTJ = new C7189afD(i).EZpvd(this.AEQbTJ);
            } catch (ArabicShapingException unused) {
            }
        }
    }

    public static boolean OLrzqt(Order order) {
        return Order.LOGICAL.equals(order);
    }

    public static boolean AEQbTJ(Order order) {
        return Order.VISUAL.equals(order);
    }
}
