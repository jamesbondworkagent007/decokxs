package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class InputsOutputsModuleModel extends BaseModel<InputsOutputs> {
    public static final int $stable = 0;

    public InputsOutputsModuleModel() {
        super("inputsOutputs");
    }

    public static final class InputsOutputs {
        public static final int $stable = 8;
        private List<DappBTCUTXOInfo> inputInfo;
        private List<DappBTCUTXOInfo> outputInfo;
        private String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.InputsOutputsModuleModel$InputsOutputs */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InputsOutputs copy$default(InputsOutputs inputsOutputs, String str, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inputsOutputs.title;
            }
            if ((i & 2) != 0) {
                list = inputsOutputs.inputInfo;
            }
            if ((i & 4) != 0) {
                list2 = inputsOutputs.outputInfo;
            }
            return inputsOutputs.copy(str, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<DappBTCUTXOInfo> component2() {
            return this.inputInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<DappBTCUTXOInfo> component3() {
            return this.outputInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InputsOutputs copy(@NotNull String str, @NotNull List<DappBTCUTXOInfo> list, @NotNull List<DappBTCUTXOInfo> list2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new InputsOutputs(str, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputsOutputs)) {
                return false;
            }
            InputsOutputs inputsOutputs = (InputsOutputs) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) inputsOutputs.title) && Intrinsics.EZpvd(this.inputInfo, inputsOutputs.inputInfo) && Intrinsics.EZpvd(this.outputInfo, inputsOutputs.outputInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<DappBTCUTXOInfo> getInputInfo() {
            return this.inputInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<DappBTCUTXOInfo> getOutputInfo() {
            return this.outputInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.inputInfo.hashCode()) * 31) + this.outputInfo.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setInputInfo(@NotNull List<DappBTCUTXOInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.inputInfo = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOutputInfo(@NotNull List<DappBTCUTXOInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.outputInfo = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTitle(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InputsOutputs(title=" + this.title + ", inputInfo=" + this.inputInfo + ", outputInfo=" + this.outputInfo + ")";
        }

        public InputsOutputs(@NotNull String str, @NotNull List<DappBTCUTXOInfo> list, @NotNull List<DappBTCUTXOInfo> list2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.title = str;
            this.inputInfo = list;
            this.outputInfo = list2;
        }
    }
}
