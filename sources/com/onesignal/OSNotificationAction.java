package com.onesignal;

/* JADX INFO: loaded from: classes12.dex */
public class OSNotificationAction {
    public final ActionType AEQbTJ;
    public final String EZpvd;

    public enum ActionType {
        Opened,
        ActionTaken
    }

    public OSNotificationAction(ActionType actionType, String str) {
        this.AEQbTJ = actionType;
        this.EZpvd = str;
    }
}
