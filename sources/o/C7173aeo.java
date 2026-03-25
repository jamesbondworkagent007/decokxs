package o;

import com.ibm.icu.impl.number.DecimalFormatProperties;
import com.ibm.icu.impl.number.Padder;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: o.aeo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7173aeo {

    /* JADX INFO: renamed from: o.aeo$ActionBar */
    public static class ActionBar {
        public long valueOf = 281474976645120L;
        public int values = 0;
        public int ejfBZ = 0;
        public int fetchVPNInfo = 0;
        public int isConnected = 0;
        public int fIwbmz = 0;
        public int OLrzqt = 0;
        public int copydefault = 0;
        public int AEQbTJ = 0;
        public boolean djBIcL = false;
        public int uzCIH = 0;
        public Padder.PadPosition AuCTel = null;
        public C7167aei hDKMBd = null;
        public boolean EZpvd = false;
        public int KWHzl = 0;
        public boolean DbNXlk = false;
        public boolean AYXKKw = false;
        public boolean gEmmrt = false;
        public boolean AhwBna = false;
        public boolean AkhnZx = false;
        public long fJNWhG = 0;
        public long iwGUEr = 0;
        public long fARcdN = 0;
    }

    public static StateListAnimator copydefault(java.lang.String str) {
        Application application = new Application(str);
        StateListAnimator stateListAnimator = new StateListAnimator(str);
        EZpvd(application, stateListAnimator);
        return stateListAnimator;
    }

    public static void EZpvd(java.lang.String str, DecimalFormatProperties decimalFormatProperties, int i) {
        copydefault(str, decimalFormatProperties, i);
    }

    public static void copydefault(java.lang.String str, DecimalFormatProperties decimalFormatProperties) {
        EZpvd(str, decimalFormatProperties, 0);
    }

    /* JADX INFO: renamed from: o.aeo$StateListAnimator */
    public static class StateListAnimator implements InterfaceC7102adW {
        public java.lang.String AEQbTJ;
        public ActionBar EZpvd;
        public ActionBar copydefault;

        public static int AEQbTJ(long j) {
            return ((int) (j >>> 32)) - ((int) j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC7102adW
        public boolean OLrzqt() {
            return this.copydefault != null;
        }

        public StateListAnimator(java.lang.String str) {
            this.AEQbTJ = str;
        }

        @Override // o.InterfaceC7102adW
        public char OLrzqt(int i, int i2) {
            long jAEQbTJ = AEQbTJ(i);
            int i3 = (int) jAEQbTJ;
            int i4 = (int) (jAEQbTJ >>> 32);
            if (i2 < 0 || i2 >= i4 - i3) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            return this.AEQbTJ.charAt(i3 + i2);
        }

        @Override // o.InterfaceC7102adW
        public int OLrzqt(int i) {
            return AEQbTJ(AEQbTJ(i));
        }

        @Override // o.InterfaceC7102adW
        public java.lang.String KWHzl(int i) {
            long jAEQbTJ = AEQbTJ(i);
            int i2 = (int) jAEQbTJ;
            int i3 = (int) (jAEQbTJ >>> 32);
            return i2 == i3 ? "" : this.AEQbTJ.substring(i2, i3);
        }

        public final long AEQbTJ(int i) {
            boolean z = (i & 256) != 0;
            boolean z2 = (i & 512) != 0;
            boolean z3 = (i & 1024) != 0;
            if (z2 && z3) {
                return this.copydefault.fARcdN;
            }
            if (z3) {
                return this.EZpvd.fARcdN;
            }
            if (z && z2) {
                return this.copydefault.fJNWhG;
            }
            if (z) {
                return this.EZpvd.fJNWhG;
            }
            if (z2) {
                return this.copydefault.iwGUEr;
            }
            return this.EZpvd.iwGUEr;
        }

        @Override // o.InterfaceC7102adW
        public boolean AEQbTJ() {
            return this.EZpvd.AkhnZx;
        }

        @Override // o.InterfaceC7102adW
        public boolean copydefault() {
            return this.copydefault.AhwBna;
        }

        @Override // o.InterfaceC7102adW
        public boolean KWHzl() {
            ActionBar actionBar;
            return this.EZpvd.gEmmrt || ((actionBar = this.copydefault) != null && actionBar.gEmmrt);
        }

        @Override // o.InterfaceC7102adW
        public boolean copydefault(int i) {
            return C7105adZ.OLrzqt(this.AEQbTJ, i);
        }

        @Override // o.InterfaceC7102adW
        public boolean EZpvd() {
            return this.EZpvd.fIwbmz > 0;
        }
    }

    /* JADX INFO: renamed from: o.aeo$Application */
    public static class Application {
        public final java.lang.String AEQbTJ;
        public int KWHzl = 0;

        public Application(java.lang.String str) {
            this.AEQbTJ = str;
        }

        public int AEQbTJ() {
            if (this.KWHzl == this.AEQbTJ.length()) {
                return -1;
            }
            return this.AEQbTJ.codePointAt(this.KWHzl);
        }

        public int KWHzl() {
            int iAEQbTJ = AEQbTJ();
            this.KWHzl += java.lang.Character.charCount(iAEQbTJ);
            return iAEQbTJ;
        }

        public java.lang.IllegalArgumentException OLrzqt(java.lang.String str) {
            return new java.lang.IllegalArgumentException("Malformed pattern for ICU DecimalFormat: \"" + this.AEQbTJ + "\": " + str + " at position " + this.KWHzl);
        }
    }

    public static void EZpvd(Application application, StateListAnimator stateListAnimator) {
        ActionBar actionBar = new ActionBar();
        stateListAnimator.EZpvd = actionBar;
        AhwBna(application, actionBar);
        if (application.AEQbTJ() == 59) {
            application.KWHzl();
            if (application.AEQbTJ() != -1) {
                ActionBar actionBar2 = new ActionBar();
                stateListAnimator.copydefault = actionBar2;
                AhwBna(application, actionBar2);
            }
        }
        if (application.AEQbTJ() != -1) {
            throw application.OLrzqt("Found unquoted special character");
        }
    }

    public static void AhwBna(Application application, ActionBar actionBar) {
        copydefault(application, actionBar, Padder.PadPosition.BEFORE_PREFIX);
        actionBar.fJNWhG = AEQbTJ(application, actionBar);
        copydefault(application, actionBar, Padder.PadPosition.AFTER_PREFIX);
        OLrzqt(application, actionBar);
        EZpvd(application, actionBar);
        copydefault(application, actionBar, Padder.PadPosition.BEFORE_SUFFIX);
        actionBar.iwGUEr = AEQbTJ(application, actionBar);
        copydefault(application, actionBar, Padder.PadPosition.AFTER_SUFFIX);
    }

    public static void copydefault(Application application, ActionBar actionBar, Padder.PadPosition padPosition) {
        if (application.AEQbTJ() != 42) {
            return;
        }
        if (actionBar.AuCTel != null) {
            throw application.OLrzqt("Cannot have multiple pad specifiers");
        }
        actionBar.AuCTel = padPosition;
        application.KWHzl();
        actionBar.fARcdN |= (long) application.KWHzl;
        AEQbTJ(application);
        actionBar.fARcdN |= ((long) application.KWHzl) << 32;
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static long AEQbTJ(o.C7173aeo.Application r5, o.C7173aeo.ActionBar r6) {
        /*
            int r0 = r5.KWHzl
            long r0 = (long) r0
        L3:
            int r2 = r5.AEQbTJ()
            r3 = -1
            if (r2 == r3) goto L3c
            r3 = 35
            if (r2 == r3) goto L3c
            r3 = 37
            r4 = 1
            if (r2 == r3) goto L36
            r3 = 59
            if (r2 == r3) goto L3c
            r3 = 64
            if (r2 == r3) goto L3c
            r3 = 164(0xa4, float:2.3E-43)
            if (r2 == r3) goto L33
            r3 = 8240(0x2030, float:1.1547E-41)
            if (r2 == r3) goto L30
            switch(r2) {
                case 42: goto L3c;
                case 43: goto L2d;
                case 44: goto L3c;
                case 45: goto L2a;
                case 46: goto L3c;
                default: goto L26;
            }
        L26:
            switch(r2) {
                case 48: goto L3c;
                case 49: goto L3c;
                case 50: goto L3c;
                case 51: goto L3c;
                case 52: goto L3c;
                case 53: goto L3c;
                case 54: goto L3c;
                case 55: goto L3c;
                case 56: goto L3c;
                case 57: goto L3c;
                default: goto L29;
            }
        L29:
            goto L38
        L2a:
            r6.AhwBna = r4
            goto L38
        L2d:
            r6.AkhnZx = r4
            goto L38
        L30:
            r6.AYXKKw = r4
            goto L38
        L33:
            r6.gEmmrt = r4
            goto L38
        L36:
            r6.DbNXlk = r4
        L38:
            AEQbTJ(r5)
            goto L3
        L3c:
            int r5 = r5.KWHzl
            long r5 = (long) r5
            r2 = 32
            long r5 = r5 << r2
            long r5 = r5 | r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7173aeo.AEQbTJ(o.aeo$Application, o.aeo$ActionBar):long");
    }

    public static void AEQbTJ(Application application) {
        if (application.AEQbTJ() == -1) {
            throw application.OLrzqt("Expected unquoted literal but found EOL");
        }
        if (application.AEQbTJ() == 39) {
            application.KWHzl();
            while (application.AEQbTJ() != 39) {
                if (application.AEQbTJ() == -1) {
                    throw application.OLrzqt("Expected quoted literal but found EOL");
                }
                application.KWHzl();
            }
            application.KWHzl();
            return;
        }
        application.KWHzl();
    }

    public static void OLrzqt(Application application, ActionBar actionBar) {
        copydefault(application, actionBar);
        if (application.AEQbTJ() == 46) {
            application.KWHzl();
            actionBar.djBIcL = true;
            actionBar.uzCIH++;
            KWHzl(application, actionBar);
        }
    }

    public static void copydefault(Application application, ActionBar actionBar) {
        while (true) {
            int iAEQbTJ = application.AEQbTJ();
            if (iAEQbTJ == 35) {
                if (actionBar.fetchVPNInfo > 0) {
                    throw application.OLrzqt("# cannot follow 0 before decimal point");
                }
                actionBar.uzCIH++;
                actionBar.valueOf++;
                if (actionBar.isConnected > 0) {
                    actionBar.ejfBZ++;
                } else {
                    actionBar.values++;
                }
                actionBar.fIwbmz++;
            } else if (iAEQbTJ == 44) {
                actionBar.uzCIH++;
                actionBar.valueOf <<= 16;
            } else if (iAEQbTJ == 64) {
                if (actionBar.fetchVPNInfo > 0) {
                    throw application.OLrzqt("Cannot mix 0 and @");
                }
                if (actionBar.ejfBZ > 0) {
                    throw application.OLrzqt("Cannot nest # inside of a run of @");
                }
                actionBar.uzCIH++;
                actionBar.valueOf++;
                actionBar.isConnected++;
                actionBar.fIwbmz++;
            } else {
                switch (iAEQbTJ) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        if (actionBar.isConnected > 0) {
                            throw application.OLrzqt("Cannot mix @ and 0");
                        }
                        actionBar.uzCIH++;
                        actionBar.valueOf++;
                        actionBar.fetchVPNInfo++;
                        actionBar.fIwbmz++;
                        if (application.AEQbTJ() != 48 && actionBar.hDKMBd == null) {
                            actionBar.hDKMBd = new C7167aei();
                        }
                        C7167aei c7167aei = actionBar.hDKMBd;
                        if (c7167aei != null) {
                            c7167aei.EZpvd((byte) (application.AEQbTJ() - 48), 0, true);
                        }
                        break;
                        break;
                    default:
                        long j = actionBar.valueOf;
                        short s = (short) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX);
                        short s2 = (short) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
                        short s3 = (short) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
                        if (s == 0 && s2 != -1) {
                            throw application.OLrzqt("Trailing grouping separator is invalid");
                        }
                        if (s2 == 0 && s3 != -1) {
                            throw application.OLrzqt("Grouping width of zero is invalid");
                        }
                        return;
                }
            }
            application.KWHzl();
        }
    }

    public static void KWHzl(Application application, ActionBar actionBar) {
        int i = 0;
        while (true) {
            int iAEQbTJ = application.AEQbTJ();
            if (iAEQbTJ == 35) {
                actionBar.uzCIH++;
                actionBar.copydefault++;
                actionBar.AEQbTJ++;
            } else {
                switch (iAEQbTJ) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        if (actionBar.copydefault > 0) {
                            throw application.OLrzqt("0 cannot follow # after decimal point");
                        }
                        actionBar.uzCIH++;
                        actionBar.OLrzqt++;
                        actionBar.AEQbTJ++;
                        if (application.AEQbTJ() != 48) {
                            if (actionBar.hDKMBd == null) {
                                actionBar.hDKMBd = new C7167aei();
                            }
                            actionBar.hDKMBd.EZpvd((byte) (application.AEQbTJ() - 48), i, false);
                            i = 0;
                        }
                        application.KWHzl();
                        break;
                        break;
                    default:
                        return;
                }
            }
            i++;
            application.KWHzl();
        }
    }

    public static void EZpvd(Application application, ActionBar actionBar) {
        if (application.AEQbTJ() != 69) {
            return;
        }
        if ((actionBar.valueOf & 4294901760L) != 4294901760L) {
            throw application.OLrzqt("Cannot have grouping separator in scientific notation");
        }
        application.KWHzl();
        actionBar.uzCIH++;
        if (application.AEQbTJ() == 43) {
            application.KWHzl();
            actionBar.EZpvd = true;
            actionBar.uzCIH++;
        }
        while (application.AEQbTJ() == 48) {
            application.KWHzl();
            actionBar.KWHzl++;
            actionBar.uzCIH++;
        }
    }

    public static void copydefault(java.lang.String str, DecimalFormatProperties decimalFormatProperties, int i) {
        if (str == null || str.length() == 0) {
            decimalFormatProperties.clear();
        } else {
            OLrzqt(decimalFormatProperties, copydefault(str), i);
        }
    }

    public static void OLrzqt(DecimalFormatProperties decimalFormatProperties, StateListAnimator stateListAnimator, int i) {
        boolean z;
        int i2;
        int iMax;
        ActionBar actionBar = stateListAnimator.EZpvd;
        if (i == 0) {
            z = false;
        } else {
            z = i == 1 ? actionBar.gEmmrt : true;
        }
        long j = actionBar.valueOf;
        short s = (short) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        short s2 = (short) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        short s3 = (short) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (s2 != -1) {
            decimalFormatProperties.setGroupingSize(s);
            decimalFormatProperties.setGroupingUsed(true);
        } else {
            decimalFormatProperties.setGroupingSize(-1);
            decimalFormatProperties.setGroupingUsed(false);
        }
        if (s3 != -1) {
            decimalFormatProperties.setSecondaryGroupingSize(s2);
        } else {
            decimalFormatProperties.setSecondaryGroupingSize(-1);
        }
        if (actionBar.fIwbmz == 0 && actionBar.AEQbTJ > 0) {
            iMax = java.lang.Math.max(1, actionBar.OLrzqt);
            i2 = 0;
        } else {
            int i3 = actionBar.fetchVPNInfo;
            if (i3 == 0 && actionBar.OLrzqt == 0) {
                iMax = 0;
                i2 = 1;
            } else {
                i2 = i3;
                iMax = actionBar.OLrzqt;
            }
        }
        if (actionBar.isConnected > 0) {
            decimalFormatProperties.setMinimumFractionDigits(-1);
            decimalFormatProperties.setMaximumFractionDigits(-1);
            decimalFormatProperties.setRoundingIncrement(null);
            decimalFormatProperties.setMinimumSignificantDigits(actionBar.isConnected);
            decimalFormatProperties.setMaximumSignificantDigits(actionBar.isConnected + actionBar.ejfBZ);
        } else if (actionBar.hDKMBd != null) {
            if (!z) {
                decimalFormatProperties.setMinimumFractionDigits(iMax);
                decimalFormatProperties.setMaximumFractionDigits(actionBar.AEQbTJ);
                decimalFormatProperties.setRoundingIncrement(actionBar.hDKMBd.AhwBna().setScale(actionBar.OLrzqt));
            } else {
                decimalFormatProperties.setMinimumFractionDigits(-1);
                decimalFormatProperties.setMaximumFractionDigits(-1);
                decimalFormatProperties.setRoundingIncrement(null);
            }
            decimalFormatProperties.setMinimumSignificantDigits(-1);
            decimalFormatProperties.setMaximumSignificantDigits(-1);
        } else {
            if (!z) {
                decimalFormatProperties.setMinimumFractionDigits(iMax);
                decimalFormatProperties.setMaximumFractionDigits(actionBar.AEQbTJ);
                decimalFormatProperties.setRoundingIncrement(null);
            } else {
                decimalFormatProperties.setMinimumFractionDigits(-1);
                decimalFormatProperties.setMaximumFractionDigits(-1);
                decimalFormatProperties.setRoundingIncrement(null);
            }
            decimalFormatProperties.setMinimumSignificantDigits(-1);
            decimalFormatProperties.setMaximumSignificantDigits(-1);
        }
        if (actionBar.djBIcL && actionBar.AEQbTJ == 0) {
            decimalFormatProperties.setDecimalSeparatorAlwaysShown(true);
        } else {
            decimalFormatProperties.setDecimalSeparatorAlwaysShown(false);
        }
        if (actionBar.KWHzl > 0) {
            decimalFormatProperties.setExponentSignAlwaysShown(actionBar.EZpvd);
            decimalFormatProperties.setMinimumExponentDigits(actionBar.KWHzl);
            if (actionBar.isConnected == 0) {
                decimalFormatProperties.setMinimumIntegerDigits(actionBar.fetchVPNInfo);
                decimalFormatProperties.setMaximumIntegerDigits(actionBar.fIwbmz);
            } else {
                decimalFormatProperties.setMinimumIntegerDigits(1);
                decimalFormatProperties.setMaximumIntegerDigits(-1);
            }
        } else {
            decimalFormatProperties.setExponentSignAlwaysShown(false);
            decimalFormatProperties.setMinimumExponentDigits(-1);
            decimalFormatProperties.setMinimumIntegerDigits(i2);
            decimalFormatProperties.setMaximumIntegerDigits(-1);
        }
        java.lang.String strKWHzl = stateListAnimator.KWHzl(256);
        java.lang.String strKWHzl2 = stateListAnimator.KWHzl(0);
        if (actionBar.AuCTel != null) {
            decimalFormatProperties.setFormatWidth(actionBar.uzCIH + C7105adZ.copydefault(strKWHzl) + C7105adZ.copydefault(strKWHzl2));
            java.lang.String strKWHzl3 = stateListAnimator.KWHzl(1024);
            if (strKWHzl3.length() == 1) {
                decimalFormatProperties.setPadString(strKWHzl3);
            } else if (strKWHzl3.length() == 2) {
                if (strKWHzl3.charAt(0) == '\'') {
                    decimalFormatProperties.setPadString("'");
                } else {
                    decimalFormatProperties.setPadString(strKWHzl3);
                }
            } else {
                decimalFormatProperties.setPadString(strKWHzl3.substring(1, strKWHzl3.length() - 1));
            }
            decimalFormatProperties.setPadPosition(actionBar.AuCTel);
        } else {
            decimalFormatProperties.setFormatWidth(-1);
            decimalFormatProperties.setPadString(null);
            decimalFormatProperties.setPadPosition(null);
        }
        decimalFormatProperties.setPositivePrefixPattern(strKWHzl);
        decimalFormatProperties.setPositiveSuffixPattern(strKWHzl2);
        if (stateListAnimator.copydefault != null) {
            decimalFormatProperties.setNegativePrefixPattern(stateListAnimator.KWHzl(768));
            decimalFormatProperties.setNegativeSuffixPattern(stateListAnimator.KWHzl(512));
        } else {
            decimalFormatProperties.setNegativePrefixPattern(null);
            decimalFormatProperties.setNegativeSuffixPattern(null);
        }
        if (actionBar.DbNXlk) {
            decimalFormatProperties.setMagnitudeMultiplier(2);
        } else if (actionBar.AYXKKw) {
            decimalFormatProperties.setMagnitudeMultiplier(3);
        } else {
            decimalFormatProperties.setMagnitudeMultiplier(0);
        }
    }
}
