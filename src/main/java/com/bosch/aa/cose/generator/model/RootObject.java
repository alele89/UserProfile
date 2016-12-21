
public class PersonName
{
    public string nameTypeId { get; set; }
    public string title { get; set; }
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public string nickName { get; set; }
}

public class OrganizationName
{
    public string nameTypeId { get; set; }
    public string companyName { get; set; }
    public string CompanyTitle { get; set; }
}

public class Name
{
    public PersonName personName { get; set; }
    public OrganizationName organizationName { get; set; }
}

public class StreetAddress
{
    public string building { get; set; }
    public string city { get; set; }
    public string district { get; set; }
    public string country { get; set; }
    public string houseNo { get; set; }
    public string geoCodeLat { get; set; }
    public string geoCodeLong { get; set; }
    public string floor { get; set; }
    public string region { get; set; }
    public string postalCode { get; set; }
    public string street { get; set; }
}

public class PoBoxAddress
{
    public string deliveryCode { get; set; }
    public string poBoxCode { get; set; }
    public string poBoxCountryCode { get; set; }
    public string poBoxCity { get; set; }
    public string poBoxPostlCode { get; set; }
}

public class Address
{
    public string type { get; set; }
    public Name name { get; set; }
    public string isPreferredShipping { get; set; }
    public StreetAddress streetAddress { get; set; }
    public PoBoxAddress poBoxAddress { get; set; }
}

public class Phone
{
    public string type { get; set; }
    public string number { get; set; }
    public string countryCode { get; set; }
    public string isPreferred { get; set; }
}

public class UserContactData
{
    public string versionId { get; set; }
    public string timeZone { get; set; }
    public List<Address> addresses { get; set; }
    public List<Phone> phone { get; set; }
    public string uri { get; set; }
}

public class LegalPrivacyData
{
    public string signedData { get; set; }
    public string optInOptOut { get; set; }
    public string documentReference { get; set; }
}

public class Profile
{
    public string boschGlobalId { get; set; }
    public string firstName { get; set; }
    public string lastName { get; set; }
    public string initials { get; set; }
    public string maritalStatus { get; set; }
    public string dateOfBirth { get; set; }
    public string createDate { get; set; }
    public string lastLoginDate { get; set; }
    public UserContactData userContactData { get; set; }
    public LegalPrivacyData legalPrivacyData { get; set; }
    public string isEnabled { get; set; }
    public string location { get; set; }
}

public class RootObject
{
    public Profile profile { get; set; }
}
