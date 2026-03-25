package com.onesignal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56433yFe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class CallbackThreadManager {
    public static final Activity Companion = new Activity(null);
    public static UseThread OLrzqt = UseThread.MainUI;

    public enum UseThread {
        MainUI,
        Background
    }

    public static final class Activity {

        /* JADX INFO: renamed from: com.onesignal.CallbackThreadManager$Activity$Activity, reason: collision with other inner class name */
        public final /* synthetic */ class C0684Activity {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[UseThread.values().length];
                iArr[UseThread.MainUI.ordinal()] = 1;
                iArr[UseThread.Background.ordinal()] = 2;
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.onesignal.CallbackThreadManager.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final UseThread KWHzl() {
            return CallbackThreadManager.OLrzqt;
        }

        public final void AEQbTJ(@NotNull final Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "");
            int i = C0684Activity.OLrzqt[KWHzl().ordinal()];
            if (i == 1) {
                OSUtils.EZpvd(runnable);
            } else {
                if (i != 2) {
                    return;
                }
                C56433yFe.thread$default(false, false, null, null, 0, new Function0<Unit>() { // from class: com.onesignal.CallbackThreadManager$Companion$runOnPreferred$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        runnable.run();
                    }
                }, 31, null);
            }
        }
    }
}
