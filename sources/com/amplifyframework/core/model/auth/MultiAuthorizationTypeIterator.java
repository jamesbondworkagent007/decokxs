package com.amplifyframework.core.model.auth;

import com.amplifyframework.api.aws.AuthorizationType;
import com.amplifyframework.core.model.AuthRule;
import com.amplifyframework.core.model.AuthStrategy;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes21.dex */
public final class MultiAuthorizationTypeIterator implements AuthorizationTypeIterator {
    private final List<AuthRule> authRules;
    private int currentPosition;
    private final Iterator<AuthRule> dedupedIterator;
    private AuthRule effectiveRule;

    public MultiAuthorizationTypeIterator(List<AuthRule> list) {
        this(list, new PriorityBasedAuthRuleProviderComparator());
    }

    public MultiAuthorizationTypeIterator(List<AuthRule> list, Comparator<AuthRule> comparator) {
        this.currentPosition = 0;
        this.authRules = list;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(list);
        this.dedupedIterator = treeSet.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.dedupedIterator.hasNext();
    }

    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public AuthorizationType next() {
        AuthRule next = this.dedupedIterator.next();
        this.effectiveRule = next;
        AuthStrategy.Provider authProvider = next.getAuthProvider();
        this.currentPosition++;
        return AuthorizationType.from(authProvider);
    }

    public AuthStrategy getAuthRuleStrategy() {
        AuthRule authRule = this.effectiveRule;
        if (authRule == null) {
            throw new IllegalStateException("No current item selected for the iterator.");
        }
        return authRule.getAuthStrategy();
    }

    @Override // com.amplifyframework.core.model.auth.AuthorizationTypeIterator
    public boolean isOwnerBasedRule() {
        AuthRule authRule = this.effectiveRule;
        if (authRule == null) {
            return false;
        }
        return AuthStrategy.OWNER.equals(authRule.getAuthStrategy());
    }

    public String toString() {
        return "PriorityBasedAuthRuleIterator - items(" + this.authRules.size() + ") - [" + this.authRules.toString() + "] - position:" + this.currentPosition;
    }

    public static final class PriorityBasedAuthRuleProviderComparator implements Comparator<AuthRule> {
        private PriorityBasedAuthRuleProviderComparator() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        public int compare(AuthRule authRule, AuthRule authRule2) {
            int iCompare = Integer.compare(authRule.getAuthStrategy().getPriority(), authRule2.getAuthStrategy().getPriority());
            return iCompare == 0 ? Integer.compare(authRule.getAuthProvider().getPriority(), authRule2.getAuthProvider().getPriority()) : iCompare;
        }
    }
}
