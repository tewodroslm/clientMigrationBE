

MigrationController contains three api based on the requirements and hash map, map contain int as an id and clients
Client class contain name and status, status to track if it is in legacy or in new

/legacy fetches legacy map.  
/migrate - addes new client to new and update the status in legacy to migrated.  
/new fetches the migrated 
