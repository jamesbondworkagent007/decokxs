package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.bjN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C10166bjN {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.bjN$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bjN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        public final o.AbstractC10170bjR KWHzl(@org.jetbrains.annotations.NotNull android.content.Context r3, @org.jetbrains.annotations.NotNull com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail r4) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                int r0 = r4.getTxType()
                r1 = 40
                if (r0 == r1) goto Lde
                r1 = 65
                if (r0 == r1) goto Ld8
                r1 = 72
                if (r0 == r1) goto Ld2
                r1 = 74
                if (r0 == r1) goto Lcc
                r1 = 87
                if (r0 == r1) goto Lc6
                r1 = 84
                if (r0 == r1) goto Lc0
                r1 = 85
                if (r0 == r1) goto Lba
                switch(r0) {
                    case 1: goto L76;
                    case 2: goto L6f;
                    case 3: goto Lb4;
                    case 4: goto L68;
                    case 5: goto Lde;
                    case 6: goto L61;
                    case 7: goto L5a;
                    case 8: goto L53;
                    case 9: goto L4c;
                    case 10: goto Ld8;
                    case 11: goto L45;
                    case 12: goto L3e;
                    default: goto L2b;
                }
            L2b:
                switch(r0) {
                    case 20: goto La8;
                    case 21: goto La2;
                    case 22: goto L9c;
                    case 23: goto L96;
                    case 24: goto L90;
                    case 25: goto L8a;
                    case 26: goto L84;
                    case 27: goto L7d;
                    default: goto L2e;
                }
            L2e:
                switch(r0) {
                    case 50: goto Lcc;
                    case 51: goto Lcc;
                    case 52: goto Lcc;
                    case 53: goto Lcc;
                    case 54: goto Lcc;
                    default: goto L31;
                }
            L31:
                switch(r0) {
                    case 56: goto Lcc;
                    case 57: goto Lcc;
                    case 58: goto Lcc;
                    case 59: goto Lcc;
                    case 60: goto Lcc;
                    case 61: goto Lcc;
                    case 62: goto Lcc;
                    default: goto L34;
                }
            L34:
                switch(r0) {
                    case 80: goto Lb4;
                    case 81: goto Lae;
                    case 82: goto Lae;
                    default: goto L37;
                }
            L37:
                o.bjY r0 = new o.bjY
                r0.<init>(r3, r4)
                goto Le3
            L3e:
                o.bkl r0 = new o.bkl
                r0.<init>(r3, r4)
                goto Le3
            L45:
                o.bjX r0 = new o.bjX
                r0.<init>(r3, r4)
                goto Le3
            L4c:
                o.bkg r0 = new o.bkg
                r0.<init>(r3, r4)
                goto Le3
            L53:
                o.bku r0 = new o.bku
                r0.<init>(r3, r4)
                goto Le3
            L5a:
                o.bkm r0 = new o.bkm
                r0.<init>(r3, r4)
                goto Le3
            L61:
                o.bjV r0 = new o.bjV
                r0.<init>(r3, r4)
                goto Le3
            L68:
                o.bjO r0 = new o.bjO
                r0.<init>(r3, r4)
                goto Le3
            L6f:
                o.bko r0 = new o.bko
                r0.<init>(r3, r4)
                goto Le3
            L76:
                o.bki r0 = new o.bki
                r0.<init>(r3, r4)
                goto Le3
            L7d:
                o.bkq r0 = new o.bkq
                r0.<init>(r3, r4)
                goto Le3
            L84:
                o.bkb r0 = new o.bkb
                r0.<init>(r3, r4)
                goto Le3
            L8a:
                o.bkf r0 = new o.bkf
                r0.<init>(r3, r4)
                goto Le3
            L90:
                o.bkj r0 = new o.bkj
                r0.<init>(r3, r4)
                goto Le3
            L96:
                o.bkr r0 = new o.bkr
                r0.<init>(r3, r4)
                goto Le3
            L9c:
                o.bjS r0 = new o.bjS
                r0.<init>(r3, r4)
                goto Le3
            La2:
                o.bkn r0 = new o.bkn
                r0.<init>(r3, r4)
                goto Le3
            La8:
                o.bkv r0 = new o.bkv
                r0.<init>(r3, r4)
                goto Le3
            Lae:
                o.bkd r0 = new o.bkd
                r0.<init>(r3, r4)
                goto Le3
            Lb4:
                o.bjY r0 = new o.bjY
                r0.<init>(r3, r4)
                goto Le3
            Lba:
                o.bkp r0 = new o.bkp
                r0.<init>(r3, r4)
                goto Le3
            Lc0:
                o.bjW r0 = new o.bjW
                r0.<init>(r3, r4)
                goto Le3
            Lc6:
                o.bke r0 = new o.bke
                r0.<init>(r3, r4)
                goto Le3
            Lcc:
                o.bjU r0 = new o.bjU
                r0.<init>(r3, r4)
                goto Le3
            Ld2:
                o.bkc r0 = new o.bkc
                r0.<init>(r3, r4)
                goto Le3
            Ld8:
                o.bjT r0 = new o.bjT
                r0.<init>(r3, r4)
                goto Le3
            Lde:
                o.bkt r0 = new o.bkt
                r0.<init>(r3, r4)
            Le3:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C10166bjN.TaskDescription.KWHzl(android.content.Context, com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail):o.bjR");
        }
    }
}
