class Solution:
    def subdomainVisits(self, cpdomains: List[str]) -> List[str]:
        
        domain_dictionary = {}

        for domain in cpdomains:
            domain = domain.replace(' ', '.').split('.')

            for i in range(1, len(domain)):
                sub_domain = '.'.join(domain[i:])
                domain_dictionary[sub_domain] = domain_dictionary.get(sub_domain, 0) + int(domain[0])

        answer = [' '.join([str(val), key]) for key, val in domain_dictionary.items()]

        return answer
