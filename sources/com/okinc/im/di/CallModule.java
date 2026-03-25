package com.okinc.im.di;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C35235nrW;
import o.C35255nrq;
import o.C43251rlk;
import o.InterfaceC35234nrV;
import o.InterfaceC35259nru;
import o.InterfaceC42569rXs;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class CallModule {
    public static final Activity Companion = new Activity(null);

    @yCR
    public abstract InterfaceC35234nrV AEQbTJ(@NotNull C35235nrW c35235nrW);

    @yCR
    public abstract InterfaceC35259nru KWHzl(@NotNull C35255nrq c35255nrq);

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.di.CallModule.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        @yCR
        public final InterfaceC42569rXs copydefault() {
            return (InterfaceC42569rXs) C43251rlk.OLrzqt(InterfaceC42569rXs.class);
        }
    }
}
