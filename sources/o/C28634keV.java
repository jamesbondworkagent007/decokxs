package o;

import com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData;
import com.okinc.business.market.features.meme.domain.model.MemeTabType;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28634keV {
    public final MemeFilter AEQbTJ;
    public final MemeProtocolFilterUiData EZpvd;
    public final java.lang.String KWHzl;
    public final MemeTabType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28634keV() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28634keV copy$default(C28634keV c28634keV, java.lang.String str, MemeTabType memeTabType, MemeProtocolFilterUiData memeProtocolFilterUiData, MemeFilter memeFilter, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c28634keV.KWHzl;
        }
        if ((i & 2) != 0) {
            memeTabType = c28634keV.OLrzqt;
        }
        if ((i & 4) != 0) {
            memeProtocolFilterUiData = c28634keV.EZpvd;
        }
        if ((i & 8) != 0) {
            memeFilter = c28634keV.AEQbTJ;
        }
        return c28634keV.OLrzqt(str, memeTabType, memeProtocolFilterUiData, memeFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeProtocolFilterUiData AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeTabType EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeFilter KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28634keV OLrzqt(@NotNull java.lang.String str, @NotNull MemeTabType memeTabType, @NotNull MemeProtocolFilterUiData memeProtocolFilterUiData, @NotNull MemeFilter memeFilter) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(memeTabType, "");
        Intrinsics.checkNotNullParameter(memeProtocolFilterUiData, "");
        Intrinsics.checkNotNullParameter(memeFilter, "");
        return new C28634keV(str, memeTabType, memeProtocolFilterUiData, memeFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28634keV)) {
            return false;
        }
        C28634keV c28634keV = (C28634keV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c28634keV.KWHzl) && this.OLrzqt == c28634keV.OLrzqt && Intrinsics.EZpvd(this.EZpvd, c28634keV.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c28634keV.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MemeFilterUiState(chainId=" + this.KWHzl + ", rankType=" + this.OLrzqt + ", protocolFilter=" + this.EZpvd + ", localFilter=" + this.AEQbTJ + ")";
    }

    public C28634keV(@NotNull java.lang.String str, @NotNull MemeTabType memeTabType, @NotNull MemeProtocolFilterUiData memeProtocolFilterUiData, @NotNull MemeFilter memeFilter) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(memeTabType, "");
        Intrinsics.checkNotNullParameter(memeProtocolFilterUiData, "");
        Intrinsics.checkNotNullParameter(memeFilter, "");
        this.KWHzl = str;
        this.OLrzqt = memeTabType;
        this.EZpvd = memeProtocolFilterUiData;
        this.AEQbTJ = memeFilter;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ C28634keV(java.lang.String r46, com.okinc.business.market.features.meme.domain.model.MemeTabType r47, com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData r48, com.okinc.business.market.features.meme.filter.domain.MemeFilter r49, int r50, kotlin.jvm.internal.DefaultConstructorMarker r51) {
        /*
            r45 = this;
            r0 = r50 & 1
            if (r0 == 0) goto L7
            java.lang.String r0 = ""
            goto L9
        L7:
            r0 = r46
        L9:
            r1 = r50 & 2
            if (r1 == 0) goto L10
            com.okinc.business.market.features.meme.domain.model.MemeTabType r1 = com.okinc.business.market.features.meme.domain.model.MemeTabType.NEW_PAIR
            goto L12
        L10:
            r1 = r47
        L12:
            r2 = r50 & 4
            if (r2 == 0) goto L22
            com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData r2 = new com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 7
            r8 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L24
        L22:
            r2 = r48
        L24:
            r3 = r50 & 8
            if (r3 == 0) goto L76
            com.okinc.business.market.features.meme.filter.domain.MemeFilter r3 = new com.okinc.business.market.features.meme.filter.domain.MemeFilter
            r4 = r3
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
            r42 = -1
            r43 = 31
            r44 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r4 = r45
            goto L7a
        L76:
            r4 = r45
            r3 = r49
        L7a:
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C28634keV.<init>(java.lang.String, com.okinc.business.market.features.meme.domain.model.MemeTabType, com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData, com.okinc.business.market.features.meme.filter.domain.MemeFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean OLrzqt() {
        MemeFilter memeFilter = this.AEQbTJ;
        return (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getTop10HoldingMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getTop10HoldingMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getDevHoldingMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getDevHoldingMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getInsiderMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getInsiderMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getSniperMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getSniperMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getBundleMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getBundleMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getFreshHoldMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getFreshHoldMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getPhishHoldMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getPhishHoldMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getBondingMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getBondingMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getMigratedTokensMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getMigratedTokensMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getMarketCapMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getMarketCapMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getVolumeMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getVolumeMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getHoldersMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getHoldersMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getTokenAgeMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getTokenAgeMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getTransactionsMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getTransactionsMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getBuyMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getBuyMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getSellMin()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getSellMax()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getKeyword()) ^ true) || (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) memeFilter.getKeywordExclude()) ^ true) || (memeFilter.getSelectedSocialData().isEmpty() ^ true);
    }
}
