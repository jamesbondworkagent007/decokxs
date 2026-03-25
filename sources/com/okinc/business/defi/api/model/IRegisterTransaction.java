package com.okinc.business.defi.api.model;

import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IRegisterTransaction {
    TaskDescription EZpvd();

    String KWHzl();

    RegisterType copydefault();

    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        public final String AEQbTJ;
        public final String EZpvd;
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        public TaskDescription(@NotNull String str, @NotNull String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.AEQbTJ = str2;
            this.OLrzqt = str3;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RegisterType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RegisterType[] $VALUES;
        public static final RegisterType RegisterToken = new RegisterType("RegisterToken", 0);
        public static final RegisterType RegisterAddress = new RegisterType("RegisterAddress", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RegisterType[] $values() {
            return new RegisterType[]{RegisterToken, RegisterAddress};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RegisterType> getEntries() {
            return $ENTRIES;
        }

        private RegisterType(String str, int i) {
        }

        static {
            RegisterType[] registerTypeArr$values = $values();
            $VALUES = registerTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(registerTypeArr$values);
        }

        public static RegisterType valueOf(String str) {
            return (RegisterType) Enum.valueOf(RegisterType.class, str);
        }

        public static RegisterType[] values() {
            return (RegisterType[]) $VALUES.clone();
        }
    }
}
