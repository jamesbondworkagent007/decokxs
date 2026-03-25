package co.touchlab.stately.collections;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.IR;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: loaded from: classes21.dex */
public final class ConcurrentMutableMap$computeIfAbsent$1<V> extends Lambda implements Function0<V> {
    final /* synthetic */ Function1<K, V> $defaultValue;
    final /* synthetic */ K $key;
    final /* synthetic */ IR<K, V> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super K, ? extends V> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentMutableMap$computeIfAbsent$1(IR<K, V> ir, K k, Function1<? super K, ? extends V> function1) {
        super(0);
        this.this$0 = ir;
        this.$key = k;
        this.$defaultValue = function1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final V invoke() {
        V v = (V) this.this$0.copydefault.get(this.$key);
        if (v != null) {
            return v;
        }
        V vInvoke = this.$defaultValue.invoke(this.$key);
        this.this$0.copydefault.put(this.$key, vInvoke);
        return vInvoke;
    }
}
