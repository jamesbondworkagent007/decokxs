package o;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53739wrF {
    public final C53743wrJ KWHzl;
    public final StrategyDetailsResponse OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C53739wrF() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C53739wrF copy$default(C53739wrF c53739wrF, StrategyDetailsResponse strategyDetailsResponse, C53743wrJ c53743wrJ, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            strategyDetailsResponse = c53739wrF.OLrzqt;
        }
        if ((i & 2) != 0) {
            c53743wrJ = c53739wrF.KWHzl;
        }
        return c53739wrF.EZpvd(strategyDetailsResponse, c53743wrJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53739wrF EZpvd(@NotNull StrategyDetailsResponse strategyDetailsResponse, @NotNull C53743wrJ c53743wrJ) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        Intrinsics.checkNotNullParameter(c53743wrJ, "");
        return new C53739wrF(strategyDetailsResponse, c53743wrJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53743wrJ KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDetailsResponse OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53739wrF)) {
            return false;
        }
        C53739wrF c53739wrF = (C53739wrF) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c53739wrF.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c53739wrF.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalCloneUiState(algoInfo=" + this.OLrzqt + ", inputSettings=" + this.KWHzl + ")";
    }

    public C53739wrF(@NotNull StrategyDetailsResponse strategyDetailsResponse, @NotNull C53743wrJ c53743wrJ) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        Intrinsics.checkNotNullParameter(c53743wrJ, "");
        this.OLrzqt = strategyDetailsResponse;
        this.KWHzl = c53743wrJ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ C53739wrF(com.okinc.unify_trade.biz.StrategyDetailsResponse r254, o.C53743wrJ r255, int r256, kotlin.jvm.internal.DefaultConstructorMarker r257) {
        /*
            r253 = this;
            r0 = r256
            r1 = r0 & 1
            if (r1 == 0) goto L1f5
            com.okinc.unify_trade.biz.StrategyDetailsResponse r1 = new com.okinc.unify_trade.biz.StrategyDetailsResponse
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r77 = 0
            r78 = 0
            r79 = 0
            r80 = 0
            r81 = 0
            r82 = 0
            r83 = 0
            r84 = 0
            r85 = 0
            r86 = 0
            r87 = 0
            r88 = 0
            r89 = 0
            r90 = 0
            r91 = 0
            r92 = 0
            r93 = 0
            r94 = 0
            r95 = 0
            r96 = 0
            r97 = 0
            r98 = 0
            r99 = 0
            r100 = 0
            r101 = 0
            r102 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            r107 = 0
            r108 = 0
            r109 = 0
            r110 = 0
            r111 = 0
            r112 = 0
            r113 = 0
            r114 = 0
            r115 = 0
            r116 = 0
            r117 = 0
            r118 = 0
            r119 = 0
            r120 = 0
            r121 = 0
            r122 = 0
            r123 = 0
            r124 = 0
            r125 = 0
            r126 = 0
            r127 = 0
            r128 = 0
            r129 = 0
            r130 = 0
            r131 = 0
            r132 = 0
            r133 = 0
            r134 = 0
            r135 = 0
            r136 = 0
            r137 = 0
            r138 = 0
            r139 = 0
            r140 = 0
            r141 = 0
            r142 = 0
            r143 = 0
            r144 = 0
            r145 = 0
            r146 = 0
            r147 = 0
            r148 = 0
            r149 = 0
            r150 = 0
            r151 = 0
            r152 = 0
            r153 = 0
            r154 = 0
            r155 = 0
            r156 = 0
            r157 = 0
            r158 = 0
            r159 = 0
            r160 = 0
            r161 = 0
            r162 = 0
            r163 = 0
            r164 = 0
            r165 = 0
            r166 = 0
            r167 = 0
            r168 = 0
            r169 = 0
            r170 = 0
            r171 = 0
            r172 = 0
            r173 = 0
            r174 = 0
            r175 = 0
            r176 = 0
            r177 = 0
            r178 = 0
            r179 = 0
            r180 = 0
            r181 = 0
            r182 = 0
            r183 = 0
            r184 = 0
            r185 = 0
            r186 = 0
            r187 = 0
            r188 = 0
            r189 = 0
            r190 = 0
            r191 = 0
            r192 = 0
            r193 = 0
            r194 = 0
            r195 = 0
            r196 = 0
            r197 = 0
            r198 = 0
            r199 = 0
            r200 = 0
            r201 = 0
            r202 = 0
            r203 = 0
            r204 = 0
            r205 = 0
            r206 = 0
            r207 = 0
            r208 = 0
            r209 = 0
            r210 = 0
            r211 = 0
            r212 = 0
            r213 = 0
            r214 = 0
            r215 = 0
            r216 = 0
            r217 = 0
            r218 = 0
            r219 = 0
            r220 = 0
            r221 = 0
            r222 = 0
            r223 = 0
            r224 = 0
            r225 = 0
            r226 = 0
            r227 = 0
            r228 = 0
            r229 = 0
            r230 = 0
            r231 = 0
            r232 = 0
            r233 = 0
            r234 = 0
            r235 = 0
            r236 = 0
            r237 = 0
            r238 = 0
            r239 = 0
            r240 = 0
            r241 = 0
            r242 = 0
            r243 = 0
            r244 = -1
            r245 = -1
            r246 = -1
            r247 = -1
            r248 = -1
            r249 = -1
            r250 = -1
            r251 = 131071(0x1ffff, float:1.8367E-40)
            r252 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r190, r191, r192, r193, r194, r195, r196, r197, r198, r199, r200, r201, r202, r203, r204, r205, r206, r207, r208, r209, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r220, r221, r222, r223, r224, r225, r226, r227, r228, r229, r230, r231, r232, r233, r234, r235, r236, r237, r238, r239, r240, r241, r242, r243, r244, r245, r246, r247, r248, r249, r250, r251, r252)
            goto L1f7
        L1f5:
            r1 = r254
        L1f7:
            r0 = r0 & 2
            if (r0 == 0) goto L20d
            o.wrJ r0 = new o.wrJ
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 63
            r10 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = r253
            goto L211
        L20d:
            r2 = r253
            r0 = r255
        L211:
            r2.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C53739wrF.<init>(com.okinc.unify_trade.biz.StrategyDetailsResponse, o.wrJ, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
