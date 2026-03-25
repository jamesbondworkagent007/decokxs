package com.okinc.uilab.stateful;

import android.view.View;
import com.immomo.mls.fun.lt.SILoading;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface StatefulView {
    View AEQbTJ(@NotNull Status status);

    void setStatus(@NotNull Status status);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status None = new Status("None", 0);
        public static final Status Content = new Status("Content", 1);
        public static final Status Empty = new Status("Empty", 2);
        public static final Status Loading = new Status(SILoading.LUA_CLASS_NAME, 3);
        public static final Status Error = new Status("Error", 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Status[] $values() {
            return new Status[]{None, Content, Empty, Loading, Error};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i) {
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }
}
