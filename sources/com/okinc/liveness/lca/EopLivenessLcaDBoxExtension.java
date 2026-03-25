package com.okinc.liveness.lca;

import android.app.Activity;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.debugtool.LcaDebugToolManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC43215rlA;
import o.C54819xWm;
import o.mMP;

/* JADX INFO: loaded from: classes9.dex */
public final class EopLivenessLcaDBoxExtension extends AbstractC43215rlA implements mMP {
    public static final String SP_KYC_IN_HOUSE_GALLERY = "SP_EOP_LIVENESS_LCA";
    public int icon;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public final int group = 1;
    public final int priority = 230;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getGroup() {
        return this.group;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.priority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public String name() {
        return "OKCompliance LCA liveness debug tool";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setIcon(int i) {
        this.icon = i;
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return false;
    }

    @Override // o.mMP
    public String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.EopLivenessLcaDBoxExtension.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // o.mMP
    public boolean onClick() {
        SPUtils.put(SP_KYC_IN_HOUSE_GALLERY, Boolean.TRUE);
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            return true;
        }
        LcaDebugToolManager.INSTANCE.startLcaSampleApp(activityAEQbTJ);
        return true;
    }
}
