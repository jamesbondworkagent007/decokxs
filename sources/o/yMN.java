package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import o.yOV;

/* JADX INFO: loaded from: classes13.dex */
public final class yMN extends AbstractC56640yMw {
    public static final ActionBar copydefault = new ActionBar(null);
    public static final AbstractC56640yMw KWHzl = new yMN();

    private yMN() {
        super(new LockBasedStorageManager("FallbackBuiltIns"));
        KWHzl(true);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yMN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final AbstractC56640yMw AEQbTJ() {
            return yMN.KWHzl;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: zLjUOn()Lo/yOV; */
    @Override // o.AbstractC56640yMw
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public yOV.StateListAnimator zLjUOn() {
        return yOV.StateListAnimator.copydefault;
    }
}
