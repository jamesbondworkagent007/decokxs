package o;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC49408unw;

/* JADX INFO: renamed from: o.unw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49408unw<T extends AbstractC49408unw<T>> implements InterfaceC49369unJ<T> {
    public static final int $stable = 8;
    private int _version;
    private final Function1<T, T> onCopy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC49408unw() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void get_version$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getImmutable() {
        return this.onCopy == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49369unJ
    public int getVersion() {
        return this._version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49369unJ
    public void updateVersion(int i) {
        this._version = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super T extends o.unw<T>, ? extends T extends o.unw<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC49408unw(Function1<? super T, ? extends T> function1) {
        this.onCopy = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super T extends o.unw<T>, ? extends T extends o.unw<T>>):void (m)] (LINE:39) call: o.unw.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ AbstractC49408unw(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Method merged with bridge method: replica()Ljava/lang/Object; */
    @Override // o.InterfaceC49369unJ
    public T replica() {
        Function1<T, T> function1 = this.onCopy;
        if (function1 == null) {
            throw new java.lang.IllegalStateException("onCopy should not be null");
        }
        T tInvoke = function1.invoke(this);
        if (C49372unM.AEQbTJ.copydefault()) {
            tInvoke.getVersion();
            Objects.toString(tInvoke);
        }
        return tInvoke;
    }
}
