package com.okinc.business.appupdate.debug;

import android.app.Activity;
import android.content.Intent;
import o.AbstractC43215rlA;
import o.C54819xWm;
import o.mMP;

/* JADX INFO: loaded from: classes3.dex */
public final class UpgradePreviewDBoxExtension extends AbstractC43215rlA implements mMP {
    public static final int $stable = 8;
    private int icon;
    private final int group = 1;
    private final int priority = 211;

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
        return "Upgrade Preview";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setIcon(int i) {
        this.icon = i;
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return true;
    }

    @Override // o.mMP
    public String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    @Override // o.mMP
    public boolean onClick() {
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            return true;
        }
        activityAEQbTJ.startActivity(new Intent(activityAEQbTJ, (Class<?>) UpgradePreviewActivity.class));
        return true;
    }
}
